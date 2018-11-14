package excel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_Logout_ExcelAPI {
	public WebDriver driver;
	@Test
	public void f() throws Exception {
		Excel_API e = new Excel_API("D:\\LiveProject_17_AUG_630PM\\testdata\\login.xlsx");
		int numberOfRows = e.getRows("Sheet1");
		for (int i = 1; i < numberOfRows; i++) {
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(e.getCellData("Sheet1", 0, i));
			Thread.sleep(1000);
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}
}
