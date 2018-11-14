package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BBC_MoreDD {
	public WebDriver driver;
	@Test
	public void f() {
		driver.findElement(By.linkText("More")).click();
		WebElement header = driver.findElement(By.xpath
											("//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']/ul"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println("Available links are: " + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().equalsIgnoreCase("Radio"))
			{
				links.get(i).click();
			}
			header = driver.findElement(By.xpath
					("//div[@class='orb-panel-content b-g-p b-r orb-nav-sec']/ul"));
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
