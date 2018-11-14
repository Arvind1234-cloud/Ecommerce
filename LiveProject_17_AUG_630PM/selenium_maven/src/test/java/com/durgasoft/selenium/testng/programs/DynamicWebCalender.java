package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class DynamicWebCalender {
	public WebDriver driver;
	@Test
	public void f() throws Exception {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		Thread.sleep(5000);
		// Check IN
		String date = "20-October 2018";
		String[] splitter = date.split("-");
		String checkinDate = splitter[0];
		String checkinMonth = splitter[1];
		selectDate(checkinMonth, checkinDate);
		Thread.sleep(5000);
		// Check Out
		driver.findElement(By.xpath("//*[@id='Div1']/button")).click();
		Thread.sleep(5000);
		String chkDate="20-December 2018";
		String[] checkSplitter=chkDate.split("-");
		String checkOutDatae=checkSplitter[0];
		String checkOutMonth=checkSplitter[1];
		selectDate(checkOutMonth, checkOutDatae);
	}

	public void selectDate(String month_year, String day) throws Exception {
		List<WebElement> elemets = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div/div/div"));
		System.out.println(elemets.size());
		for (int i = 0; i < elemets.size(); i++) {
			i = 0;
			System.out.println(elemets.get(i).getText());
			if (elemets.get(i).getText().equalsIgnoreCase(month_year)) {
				System.out.println("We are in loop");
				List<WebElement> tableData = driver
						.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a"));
				for (WebElement d : tableData) {
					System.out.println(d.getText());
					if (d.getText().equalsIgnoreCase(day)) {
						d.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
				elemets = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div/div/div"));
			}
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
}
