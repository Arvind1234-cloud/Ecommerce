package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BBC_Links {

	public WebDriver driver;

	@Test
	public void dynamicLinks() throws Exception {
		WebElement header = driver.findElement(By.xpath
															("//*[@id='page']/section[8]/div/div/div[2]"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println("Available links are: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(12000);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(12000);
			header = driver.findElement(By.xpath("//*[@id='page']/section[8]/div/div/div[2]"));
			links = header.findElements(By.tagName("a"));
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		driver.manage().window().maximize();
	}

}
