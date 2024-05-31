package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search_POM {

	public WebDriver driver;
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBar;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement goBtn;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")//dell 14
	private WebElement lap1;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[1]")
	private WebElement goToCartBtn;
	
	@FindBy(id="attach-close_sideSheet-link")
	private WebElement close;
	
	public Amazon_Search_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}		
	public WebElement Close() {
		return close;
	}
	public WebElement getSearchBar() {
		return searchBar;
	}
	public WebElement clickGoBtn() {
		return goBtn;
	}
	public WebElement getLaptop1() {
		return lap1;
	}
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	public WebElement getGoToCartBtn() {
		return goToCartBtn;
	}
	
}
