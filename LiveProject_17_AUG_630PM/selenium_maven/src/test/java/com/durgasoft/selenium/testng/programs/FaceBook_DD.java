package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class FaceBook_DD {

	public WebDriver driver;

	@Test
	public void dropdownSelection() throws Exception {
		driver.findElement(By.id("month")).sendKeys("Jul");
		WebElement ddMonth = driver.findElement(By.id("month"));
		Select monthDD = new Select(ddMonth);
		monthDD.selectByVisibleText("Jul");
		Thread.sleep(3000);
		monthDD.selectByIndex(3);
		Thread.sleep(3000);
		monthDD.selectByValue("12");
				
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}

}
