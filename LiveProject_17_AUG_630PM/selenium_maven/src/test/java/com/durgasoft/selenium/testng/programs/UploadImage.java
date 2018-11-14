package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class UploadImage {

	public WebDriver driver;

	public void verifyLogin() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}

	public void verifyRegistration() throws Exception {
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		Thread.sleep(3000);
	}

	@Test
	public void f() throws Exception {
		verifyLogin();
		verifyRegistration();
		driver.findElement(By.name("image")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Mahesh\\Desktop\\upload.exe");
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}

}
