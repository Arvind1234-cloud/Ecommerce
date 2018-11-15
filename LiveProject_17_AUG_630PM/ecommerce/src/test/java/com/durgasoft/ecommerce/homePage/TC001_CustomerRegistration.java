package com.durgasoft.ecommerce.homePage;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.durgasoft.ecommerce.basePage.BasePage;
import com.durgasoft.ecommerce.pageUI.CreateLoginAccount;

public class TC001_CustomerRegistration extends BasePage {

	public static final Logger log = Logger.getLogger(TC001_CustomerRegistration.class.getName());

	@Test
	public void customerRegistration() throws Exception {
		log.info("*******************Starting TC001_CustomerRegistration****************");
		CreateLoginAccount login = new CreateLoginAccount(driver);
		login.createAccount();
		log.info("*******************End of TC001_CustomerRegistration******************");
		System.out.println("Updated this class");
	}

	@BeforeClass
	public void beforeTest() throws Exception {
		browserLaunch(getData("browser"), getData("url"));
	}

	@AfterClass
	public void endTest() {
		closeBrowser();
	}

	public void closeBrowser() {
		driver.quit();
		extent.endTest(test);
		extent.flush();
	}
}
