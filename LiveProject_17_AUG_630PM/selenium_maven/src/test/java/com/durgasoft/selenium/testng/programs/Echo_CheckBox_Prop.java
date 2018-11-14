package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Echo_CheckBox_Prop {
	public WebDriver driver;

	@Test(enabled = false)
	public void checkBoxProperties() {
		List<WebElement> checkBox = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for (int i = 0; i < checkBox.size(); i++) {
			System.out.println(checkBox.get(i).getAttribute("value") + "---" + checkBox.get(i).getAttribute("checked"));
		}
	}
	@Test
	public void selectAllCheckBoxes() {
		List<WebElement> checkBox = driver.findElements(By.xpath
													("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(checkBox.size());

		for (int i = 0; i < checkBox.size(); i++) {
			if (!checkBox.get(i).isSelected())
				checkBox.get(i).click();
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
	}

}
