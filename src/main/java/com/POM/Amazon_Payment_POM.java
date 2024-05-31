package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Payment_POM {

	public WebDriver driver;
	
	@FindBy(name="proceedToRetailCheckout")
	private WebElement proceedToBuy;
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	private WebElement defaultAddressbtn;
	
	@FindBy(name="ppw-instrumentRowSelection")
	private WebElement cardRadioBtn;
	
	@FindBy(xpath="(//a[contains(text(),'Enter')])[1]")
	private WebElement enterCardDetail;
	
	@FindBy(name="addCreditCardNumber")
	private WebElement cardsNum;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	private WebElement submitBtn;

	public Amazon_Payment_POM(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2,this);
}

	public WebElement getProceedToBuy() {
		return proceedToBuy;
	}

	public WebElement getDefaultAddressbtn() {
		return defaultAddressbtn;
	}

	public WebElement getCardRadioBtn() {
		return cardRadioBtn;
	}

	public WebElement getEnterCardDetail() {
		return enterCardDetail;
	}

	public WebElement getCardsNum() {
		return cardsNum;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
}