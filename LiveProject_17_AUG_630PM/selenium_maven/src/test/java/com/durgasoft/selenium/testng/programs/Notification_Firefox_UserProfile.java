package com.durgasoft.selenium.testng.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Notification_Firefox_UserProfile {
	public WebDriver driver;

	@Test
	public void notificationAlertsBySeleniumCreatedProfile() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.desktop-notifications", 1);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		driver = new FirefoxDriver(capabilities);
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
	}

	// @BeforeTest
	public void beforeTest() {
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile myprofile = p.getProfile("selenium");
		myprofile.setPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(myprofile);
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
	}

}
