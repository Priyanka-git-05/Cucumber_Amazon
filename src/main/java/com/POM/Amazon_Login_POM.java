package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_POM {

	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement signInBtn;
	
	@FindBy(name="email")
	private WebElement mobileNumField;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submitBtn;

	public Amazon_Login_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}
	
	public WebElement pressSignInBtn() {
		return signInBtn;
	}

	public WebElement getMobileNumField() {
		return mobileNumField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement pressSubmitBtn() {
		return submitBtn;
		
		
	}
	
}
