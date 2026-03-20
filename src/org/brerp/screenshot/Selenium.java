package org.brerp.screenshot;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.compiere.util.Language;
import org.idempiere.ui.zk.selenium.Widget;
import org.idempiere.ui.zk.selenium.Zk;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
	protected WebDriver driver;
	protected StringBuffer verificationErrors = new StringBuffer();
	private String baseUrl;
	protected Actions actions;
	protected WebDriverWait wait;

	// alterar dados abaixo para o seu ambiente
	private final String URL = "http://localhost:6098/webui";
	private final String lang = "Portuguese (BR)";
	public static final Language language = Language.getLanguage("pt_BR");
	private final String user = "superuser @ brerp.com.br";
	private final String userPwd = "gv_0319";
	private final String clientSystem = "System";
	private final String client = "01- Grupo Mundo do Café S/A";
	private final String clientRole = "01-Administrador do Sistema";
	public static final String systemName = "_BrERP_v";
	public static final String version = "12.0.0";
	public static final String userHome = System.getProperty("user.home");
	public static final String outputDir = userHome + "/workspaces/documentacao/idempiere-stuff/genwikipages/img/";

	@Before
	public void setUp() throws Exception {
		FirefoxOptions options = new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver", userHome + "/.geckodriver");
		System.setProperty("webdriver.firefox.bin", userHome + "/.local/firefox/firefox");
		options.setBinary(userHome + "/.local/firefox/firefox");
//		options.addArguments("--headless"); // Executa em background. Comentar linha para rodar no navegador visualmente
		options.addArguments("--disable-gpu");
		options.addArguments("--hide-scrollbars");
		options.addArguments("--ignore-certificate-errors");
		options.setAcceptInsecureCerts(true);

		driver = new FirefoxDriver(options);
		driver.manage().window().setSize(new Dimension(1900, 1000));
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		actions = new Actions(driver);
		baseUrl = URL;
	}

	protected void type(WebElement element, String value, Boolean sendEnter) {
		element.click();
		element.sendKeys(value);
		if (sendEnter) {
			element.sendKeys(Keys.ENTER);
		}
	}

	protected void setReadOnlyTextBox(String locator, String value) {
		WebElement element = driver.findElement(Zk.jq(locator));
		element.click();
		WebElement listBox = driver.findElement(Zk.jq("$listSelectBox @rows @row @select"));
		listBox.isDisplayed();
		listBox.click();
	}

	protected void type(String locator, String value, Boolean sendEnter) {
		WebElement element = driver.findElement(Zk.jq(locator));
		type(element, value, sendEnter);
	}

	protected void comboboxSelectItem(String locator, String label) {
		Widget widget = new Widget(locator);
		WebElement element = widget.$n(driver, "real");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("z-modal-mask")));
		} catch (Exception e) {
			Screenshot.log.info("Aviso: Nenhuma máscara de bloqueio detectada, seguindo execução.");
		}

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

		WebElement inputField = wait.until(ExpectedConditions.visibilityOf(element));

		inputField.sendKeys(Keys.CONTROL + "a");
		inputField.sendKeys(Keys.DELETE);
		waitResponse();
		inputField.sendKeys(label);
		waitResponse();
		inputField.sendKeys(Keys.RETURN);
		waitResponse();
	}

	protected void comboboxSelectItem(WebElement select, String label) {
		comboboxSelectItem(select.toString(), label);
	}

	protected void search(String locator, String label) {
		Widget widget = new Widget(locator + " @textbox");
		WebElement element = widget.findElement(driver);
		type(element, label, true);
		waitResponse();
	}

	protected void comboboxSetText(String locator, String text) {
		Widget widget = new Widget(locator);
		widget.execute(driver, "setValue('" + text + "', true)");
		widget.execute(driver, "fireOnChange()");
		WebElement element = widget.$n(driver, "real");
		element.click();
		waitResponse();
	}

	protected void selectCheckbox(String locator, boolean select) {
		StringBuilder selector = new StringBuilder();
		selector.append(locator.startsWith("$") ? "" : "$").append(locator).append("~ input");
		final WebElement element = driver.findElement(Zk.jq(selector.toString()));
		if (element.isSelected()) {
			if (!select) {
				element.click();
			}
		} else {
			if (select) {
				element.click();
			}
		}
	}

	protected void clickButton(String locator) {
		driver.findElement(Zk.jq(locator)).click();
	}

	protected void clearElement(String locator) {
		driver.findElement(Zk.jq(locator)).clear();
	}

	public void closeWindow(String $label) {
		Widget widget = new Widget("$desktop_tabbox @tabs @tab[label=\"" + $label + "\"]");
		widget.$n(driver, "cnt").click();
	}

	protected void selectTab(String locator, int index) {
		Widget widget = new Widget(locator);
		WebElement element = (WebElement) widget.eval(driver, "getTabs().getChildAt(" + index + ").$n('cnt');");
		element.click();
	}

	protected void selectTab(String locator, String label) {
		Widget widget = new Widget(locator + " @tab[label=\"" + label + "\"]");
		widget.$n(driver, "cnt").click();
	}

	protected String selectedTab(String locator) {
		Widget widget = new Widget(locator);
		return (String) widget.eval(driver, "getSelectedTab().getLabel()");
	}

	/**
	 * Waits for Ajax response with default timeout value.
	 */
	protected void waitResponse() {
		waitResponse(5000);
	}

	/**
	 * Waits for Ajax response according to the timeout attribute.
	 * 
	 * @param timeout
	 *
	 */
	protected void waitResponse(int timeout) {
		long s = System.currentTimeMillis();
		int i = 0;
		int ms = 500;

		String script = "!!zAu.processing() || !!jq.timers.length";
		while (i < 2) { // make sure the command is triggered.
			while (Boolean.valueOf(getEval(script))) {
				if (System.currentTimeMillis() - s > timeout) {
					break;
				}
				i = 0;// reset
				sleep(ms);
			}
			i++;
			sleep(ms);
		}
	}

	public String getEval(String script) {
		return String.valueOf(((JavascriptExecutor) driver).executeScript("return (" + script + ");"));
	}

	/**
	 * Causes the currently executing thread to sleep for the specified number of
	 * milliseconds, subject to the precision and accuracy of system timers and
	 * schedulers. The thread does not lose ownership of any monitors.
	 * 
	 * @param millis the length of time to sleep in milliseconds.
	 */
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.err.println("Thread interrompida durante o sleep:");
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	public void login(boolean system) throws Exception {

		driver.get(baseUrl);

		try {
	        By userLocator = Zk.jq("$loginPanel $txtUserId");
	        WebDriverWait loginWait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        loginWait.until(ExpectedConditions.visibilityOfElementLocated(userLocator));
	    } catch (TimeoutException e) {
	        System.err.println("Erro: A página de login não carregou ou o campo de usuário não foi encontrado a tempo.");
	        throw e;
	    }

		((JavascriptExecutor) driver).executeScript("document.querySelectorAll('input').forEach(function(el) {"
				+ "    el.setAttribute('autocomplete', 'off');" + "});");

		type("$loginPanel $txtUserId", user, false);
		type("$loginPanel $txtPassword", userPwd, false);
		comboboxSelectItem("$loginPanel $lstLanguage", lang);
		selectCheckbox("$loginPanel $chkSelectRole", true);
		clickButton("$loginPanel $Ok");

		try {
			driver.findElement(By.id("_z_7")).click();
		} catch (NoSuchElementException e) {
			Screenshot.log.info("Elemento _z_7 não encontrado. Ignorando pois pode ser opcional.");
		} catch (Exception e) {
			System.err.println("Erro inesperado ao tentar clicar no elemento _z_7:");
			e.printStackTrace();
		}

		waitForElement("$rolePanel $lstClient");

		if (system) {
			comboboxSelectItem("$rolePanel $lstClient", clientSystem);
		} else {
			comboboxSelectItem("$rolePanel $lstClient", client);
			comboboxSelectItem("$rolePanel $lstRole", clientRole);
		}

		clickButton("$rolePanel $Ok");
	}

	protected WebElement waitForElement(String locator) throws InterruptedException {
		By loginUserQuery = Zk.jq(locator);
		for (int second = 0;; second++) {
			if (second >= 60)
				throw new RuntimeException("Timeout ao esperar pelo elemento: " + locator);
			try {
				if (isElementPresent(loginUserQuery))
					break;
			} catch (Exception e) {
				Screenshot.log.info("Erro ignorado:");
			}
			sleep(500);
		}
		return driver.findElement(loginUserQuery);
	}

	protected void selectRole(String client, String role, String org, String warehouse) throws InterruptedException {
		WebElement lstClient = waitForElement("$rolePanel $lstClient");

		if (lstClient != null && lstClient.isDisplayed()) {
			comboboxSelectItem(lstClient, client);
		}

		comboboxSelectItem("$rolePanel $lstRole", role);
		comboboxSelectItem("$rolePanel $lstOrganisation", org);
		comboboxSelectItem("$rolePanel $lstWarehouse", warehouse);

		clickButton("$rolePanel $Ok");
	}

	protected boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	protected void openWindow(String label) throws Exception {
		comboboxSelectItem("$globalSearchBox", label);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		try {
			WebElement tabButton = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.className("z-tab-button")));

			if (tabButton != null) {
				try {			
					WebElement findWindow = wait
							.until(ExpectedConditions.visibilityOfElementLocated(By.className("find-window")));

					if (findWindow != null && findWindow.isDisplayed()) {
						WebElement btnOk = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-ok")));
						btnOk.click();
					}
				} catch (TimeoutException e) {
					// Se a janela de pesquisa não aparecer, continua
				} catch (Exception e) {
					System.err.println("Erro ao tentar clicar no botão OK da janela:");
					e.printStackTrace();
				}
			}

			waitResponse(1000);
		} catch (Exception e) {
			throw new Exception("Janela não encontrada ou inválida: " + label, e);
		}
	}

	protected void logout() {
		WebElement logout = driver.findElement(Zk.jq("$logout"));
		logout.click();
	}

	protected void clickProcessButton(String windowId, String btnId) {
		clickButton("$" + windowId + " $windowToolbar $BtnProcess");
		waitResponse();
		clickButton("@window[instanceName=\"processButtonPopup\"] $" + btnId);
	}

	protected void clickToolbarButton(String windowId, String toolBarButtonId) {
		clickButton("$" + windowId + " $windowToolbar $" + toolBarButtonId);
	}

	protected void clickDetailToolbarButton(String windowId, String toolBarButtonId) {
		clickButton("$" + windowId + " $detailPane $" + toolBarButtonId + ":visible");
	}

	protected WebElement getWindowMessageLabel(String windowId) {
		return driver.findElement(Zk.jq("$" + windowId + " $messages @label"));
	}

	protected void nextRecord(String windowId) {
		clickButton("$" + windowId + " $breadCrumb $Next");
	}

	protected void previousRecord(String windowId) {
		clickButton("$" + windowId + " $breadCrumb $Previous");
	}

	@After
	public void tearDown() throws Exception {
		if (driver != null) {
			driver.quit();
		}
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	protected String escape(String role) {
		return role.replace(" ", "\\\\ ");
	}

	public File printScreen(String fileName, String searchName) {
		try {
			waitResponse(3000);
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			if (screenshotBytes == null || screenshotBytes.length == 0) {
				Screenshot.log.info("Screenshot não gerada ou vazia.");
				return null;
			}
			
			Path path = Paths.get(fileName);
			Files.createDirectories(path.getParent());
			Files.write(path, screenshotBytes);

			closeButton();
			return path.toFile();
		} catch (Exception e) {
			Screenshot.log.saveError("Erro ao capturar screenshot:", e);
			return null;
		}
	}

	public void closeButton() {

		try {
			driver.findElement(By.className("z-tab-button")).click();
			waitResponse();
		} catch (Exception e) {
			// Continuar mesmo se o botão não for encontrado
		}
	}

	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	protected void logException(String context, Exception e) {
		Screenshot.log.saveError("Erro durante " + context + ":", e);
	}

}
