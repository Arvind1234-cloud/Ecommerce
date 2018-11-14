package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class RadioButton_Properties {
	public WebDriver driver;
	@Test
	public void f() {
		WebElement headerLoc = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> radio = headerLoc.findElements(By.name("group2"));
		System.out.println("Available radio buttons in group1 :"+radio.size());
		for(int i=0;i<radio.size();i++)
		{
			System.out.println(radio.get(i).getAttribute("value")
														+"---"+radio.get(i).getAttribute("checked"));
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
}
