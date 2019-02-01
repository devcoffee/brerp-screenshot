package test;

import org.junit.*;

import org.brerp.docbook.Selenium;

/**
 * Web Driver + zk jq selector, doesn't required AdempiereIdGenerator
 * @author hengsin
 *
 */
public class LoginTest extends Selenium {
	@Test
	public void testLogin() throws Exception {
		login();
	}
}
