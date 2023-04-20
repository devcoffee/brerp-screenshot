package org.brerp.screenshot;

import static org.junit.Assert.fail;

import java.io.File;
import java.time.Duration;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium {
	protected WebDriver driver;
	protected StringBuffer verificationErrors = new StringBuffer();
	private String baseUrl;
	protected Actions actions;
	
	// change below for your environment
	private final String URL ="https://test.idempiere.com/webui";
	private final String user = "superuser @ idempiere.com";
	private final String userPwd = "System";
	private final String clientSystem = "System";
	private final String client = "GardenWorld";
	private final String clientRole = "GardenWoldAdmn";
	public static final String outputDir = "/home/user/repos/idempiere-stuff/genwikipages/img/";
	public static final String version = "10.0.0";

	@Before
	public void setUp() throws Exception {
		var options = new FirefoxOptions();
		//options.setHeadless(true);
		options.setCapability("marionette", true);
		driver = new FirefoxDriver(options);
		actions = new Actions(driver);
		baseUrl = URL;
		new WebDriverWait(driver, Duration.ofSeconds(2));

		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	protected void type(WebElement element, String value, Boolean sendEnter) {
		element.click();
		actions.sendKeys(value);
		if(sendEnter) {
			actions.sendKeys(Keys.ENTER);
		}
		actions.perform();
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
		System.out.println("== Abrindo " + label);
		WebElement element = widget.$n(driver, "real");
		element.click();

		do {
			actions.sendKeys(Keys.BACK_SPACE).perform();
			actions.sendKeys(Keys.DELETE).perform();
		}while(element.getAttribute("value").length() >0 );

		waitResponse();
		type(element, label, true);
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
		widget.execute(driver, "setValue('"+text+"', true)");
		widget.execute(driver, "fireOnChange()");
		WebElement element = widget.$n(driver, "real");
		element.click();
		waitResponse();

	}

	protected void selectCheckbox(String locator, boolean select) {
		StringBuilder selector = new StringBuilder();
		selector.append(locator.startsWith("$")? "" : "$").append(locator).append("~ input");
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
		Widget widget = new Widget("$desktop_tabbox @tabs @tab[label=\""+$label+"\"]");
		widget.$n(driver, "cnt").click();


	}

	protected void selectTab(String locator, int index) {
		Widget widget = new Widget(locator);
		WebElement element = (WebElement) widget.eval(driver, "getTabs().getChildAt("+index+").$n('cnt');");
		element.click();
	}

	protected void selectTab(String locator, String label) {
		Widget widget = new Widget(locator + " @tab[label=\""+label+"\"]");
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
	 * @param timeout
	 *
	 */
	protected void waitResponse(int timeout) {
		long s = System.currentTimeMillis();
		int i = 0;
		int ms = 500;

		String script = "!!zAu.processing() || !!jq.timers.length";
		while (i < 2) { // make sure the command is triggered.
			while(Boolean.valueOf(getEval(script))) {
				if (System.currentTimeMillis() - s > timeout) {
					break;
				}
				i = 0;//reset
				sleep(ms);
			}
			i++;
			sleep(ms);
		}
	}

	public String getEval(String script) {
		return String.valueOf(((JavascriptExecutor) driver).executeScript("return ("+ script+");"));
	}

	/**
     * Causes the currently executing thread to sleep for the specified number
     * of milliseconds, subject to the precision and accuracy of system timers
     * and schedulers. The thread does not lose ownership of any monitors.
     * @param millis the length of time to sleep in milliseconds.
     */
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	public void login(boolean system) throws Exception {
		driver.get(baseUrl);

		waitResponse();

		// enter user name
		type("$loginPanel $txtUserId", user , false);

		// enter password
		type("$loginPanel $txtPassword", userPwd , false);

		//type("$loginPanel $lstLanguage", "English");

		//select language
		comboboxSelectItem("$loginPanel $lstLanguage", "Portuguese (BR)");

		// check select role
		selectCheckbox("$loginPanel $chkSelectRole", true);
		// click ok button
		clickButton("$loginPanel $Ok");

		try {
			driver.findElement(By.id("_z_7")).click();
		} catch (Exception e) {

		}

		if (system) {
			comboboxSelectItem("$rolePanel $lstClient", clientSystem);
		} else {
			comboboxSelectItem("$rolePanel $lstClient", client);
			comboboxSelectItem("$rolePanel $lstRole", clientRole);
		}

		clickButton("$rolePanel $Ok");

//		selectRole("Mundo do Café S/A", "Administrador do Sistema", "Matriz Torrefação (SP)", "MT-MSP-Revenda");


		// wait for home page
		//WebElement loginUserElement = waitForElement("$loginUserAndRole");

		// assert login user and role
		//assertEquals("GardenAdmin@GardenWorld.HQ/GardenWorld Admin", loginUserElement.getText());
	}

	protected WebElement waitForElement(String locator) throws InterruptedException {
		By loginUserQuery = Zk.jq(locator);
		for (int second = 0;; second++) {
			if (second >= 60)
				fail("timeout");
			try {
				if (isElementPresent(loginUserQuery))
					break;
			} catch (Exception e) {
			}
			sleep(500);
		}
		return driver.findElement(loginUserQuery);
	}

	protected void selectRole(String client, String role, String org, String warehouse) throws InterruptedException {
		// wait for role panel
		WebElement lstClient = waitForElement("$rolePanel $lstClient");

		// select client
		if (lstClient != null && lstClient.isDisplayed()) {
			comboboxSelectItem(lstClient, client);
		}

		// select role
		comboboxSelectItem("$rolePanel $lstRole", role);

		// select organization
		comboboxSelectItem("$rolePanel $lstOrganisation", org);

		comboboxSelectItem("$rolePanel $lstWarehouse", warehouse);

		// click ok button
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


	protected void openWindow(String label) {
		comboboxSelectItem("$globalSearchBox", label);
		actions.sendKeys(Keys.ENTER).perform();
		waitResponse(1000);
	}

	protected void logout() {
		WebElement logout = driver.findElement(Zk.jq("$logout"));
		logout.click();
	}

	protected void clickProcessButton(String windowId, String btnId) {
		clickButton("$"+windowId + " $windowToolbar $BtnProcess");
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
		return driver.findElement(Zk.jq("$"+windowId +" $messages @label"));
	}

	protected void nextRecord(String windowId) {
		clickButton("$"+windowId+" $breadCrumb $Next");
	}

	protected void previousRecord(String windowId) {
		clickButton("$"+windowId+" $breadCrumb $Previous");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	protected  String escape(String role) {
		return role.replace(" ", "\\\\ ");
	}

	public File printarTela() {
		try {
			waitResponse(3000);
			File prt = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			driver.findElement(By.className("z-tab-button")).click();
			try {
				driver.findElement(By.className("z-tab-button")).click();
			} catch (Exception e) {

			}
			return prt;
		} catch (Exception e){
			File prt = null;
			return prt;
		}
	}

	public void closeHellButton() {


		try {
			driver.findElement(By.className("z-tab-button")).click();
			waitResponse(1500);
		} catch (Exception e){

		}

		try {
			driver.findElement(By.className("z-tab-button")).click();
			waitResponse(1500);
		} catch (Exception e){

		}

	}

	public void quit() {
		driver.quit();
	}

}
