package com.durgasoft.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.durgasoft.ecommerce.basePage.BasePage;

public class CreateLoginAccount extends BasePage{
	
	public static final Logger log=Logger.getLogger(CreateLoginAccount.class.getName());
	
	@FindBy(linkText="Sign in") WebElement linkSignIN;
	@FindBy(id="email_create") WebElement txtEmailID;
	@FindBy(id="SubmitCreate") WebElement btnCreateAnAccount;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement txtCreateAnAccount;
	@FindBy(id="id_gender1") WebElement radioMr;
	@FindBy(id="customer_firstname")WebElement txtFirstName;
	@FindBy(id="customer_lastname")WebElement txtLastName;
	@FindBy(id="passwd")WebElement txtPassword;
	@FindBy(id="days")WebElement dropDownDays;
	@FindBy(id="months")WebElement dropDownMonth;
	@FindBy(id="years")WebElement dropDownYears;
	@FindBy(id="address1") WebElement txtAddress1;
	@FindBy(id="city")WebElement txtCity;
	@FindBy(id="id_state")WebElement dropDownState;
	@FindBy(id="postcode")WebElement txtZipCode;
	@FindBy(id="id_country")WebElement dropDownCountry;
	@FindBy(id="phone_mobile")WebElement txtMobileNo;
	@FindBy(id="alias")WebElement txtAliasAddress;
	@FindBy(id="submitAccount")WebElement btnRegister;
	@FindBy(xpath="//h1[text()='My account']")WebElement txtMyAccount;
	@FindBy(linkText = "Sign out")	WebElement btnSignOut;
	
	public CreateLoginAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createAccount() throws Exception {
		linkSignIN.click();
		log.info("Clicked on SignIN button with object: "+linkSignIN.toString());
		txtEmailID.sendKeys(getData("firstName")+getData("lastName")
																+randomNumber()+getData("domainName"));
		log.info("Entering Email ID :"+txtEmailID.getAttribute("value")
																+" using object"+txtEmailID.toString());
		Thread.sleep(10000);
		btnCreateAnAccount.click();
		log.info("Clicking on Create an account: "+btnCreateAnAccount.toString());
		//elemenVisible(30, txtCreateAnAccount);
		Thread.sleep(5000);
		assertEquals(txtCreateAnAccount.getText(), "CREATE AN ACCOUNT");
		log.info("Verifying customer info page by using object: "+txtCreateAnAccount.toString());
		radioMr.click();
		log.info("Clicking on Mr Radio button by using object: "+radioMr.toString());
		txtFirstName.sendKeys("Mahesh");
		log.info("Entering first name by using object :" + txtFirstName.toString());
		txtLastName.sendKeys("D");
		log.info("Entering last name by using object :" + txtLastName.toString());
		txtPassword.sendKeys("abc@1234");
		log.info("Entering password by using object :" + txtPassword.toString());
		selectOption(dropDownDays, 3);
		log.info("Selected a day by using object :" + dropDownDays.toString());
		selectOption(dropDownMonth, 3);
		log.info("Selected a month by using object :" + dropDownMonth.toString());
		selectOption(dropDownYears, 3);
		log.info("Selected a year by using object :" + dropDownYears.toString());
		txtAddress1.sendKeys(getData("address1"));
		log.info("Entering address by using object :" + txtAddress1.toString());
		txtCity.sendKeys(getData("city"));
		log.info("Entering state by using object :" + txtCity.toString());
		selectOption(dropDownState, 3);
		log.info("Selected a state by using object :" + dropDownState.toString());
		txtZipCode.sendKeys("12345");
		log.info("Entering zipcode by using object :" + txtZipCode.toString());
		selectOption(dropDownCountry, 1);
		log.info("Selected a country by using object :" + dropDownCountry.toString());
		txtMobileNo.sendKeys("1234567890");
		log.info("Entering mobile number by using object :" + txtMobileNo.toString());
		txtAliasAddress.sendKeys("Vijayawada");
		log.info("Entering aliasing Address by using object :" + txtAliasAddress.toString());
		btnRegister.click();
		log.info("Clicking on Register :" + btnRegister.toString());
		Thread.sleep(5000);
		assertEquals(txtMyAccount.getText(), "MY ACCOUNT");
		log.info("Verified My account page by using object :" + txtMyAccount.toString());
		btnSignOut.click();
		log.info("Clicked on SignOut button with object : " + btnSignOut.toString());
		
	}
}
