package com.actions;

import com.BaseClass.BaseClass;
import com.POMA.POMA_Amazon;
import com.Property.Config_Reader;


public class Action extends BaseClass{
	POMA_Amazon pa = new POMA_Amazon();
	Config_Reader cr = new Config_Reader(); 
	
	public void launchUrl() {
			implicitWait(30);
			launchURL(driver, cr.getUrl(), 5);
	}
	public void pressSignIn() {
			clickTheElement(driver,pa.getloginpage().pressSignInBtn(), 5);
	}
	public void entermobile() {
			passValue(driver, pa.getloginpage().getMobileNumField(),cr.getmobileNum(), 5);	
	}	
	public void clickContinue() {
			clickTheElement(driver,pa.getloginpage().getContinueBtn(), 5);
	}
	public void enterPass()	{
		passValue(driver,pa.getloginpage().getPasswordField(),cr.getPassword(), 5);
	}	
	public void clickSubmit()	{
			clickTheElement(driver,pa.getloginpage().pressSubmitBtn(), 5);
	}
	public void searchProduct1(String productname) {
		passValue(driver,pa.getSearchpage().getSearchBar(), productname, 5);
	}
	public void clickSearchIcon() {
		clickTheElement(driver,pa.getSearchpage().clickGoBtn(), 5);
	}
	public void scrolldown() {
		scroll(driver, 0, 500);
		implicitWait(10);
	}
	public void clickprod1() {
		clickTheElement(driver,pa.getSearchpage().getLaptop1() ,10);
	}
	public void window() {
		windowHandles();
	}
	public void scrolldown2() {
		scroll(driver, 0, 300);
	}
	public void cartBtn() {
		clickTheElement(driver,pa.getSearchpage().getAddToCartBtn(), 5);
		staticwait(10000);
		clickTheElement(driver, pa.getSearchpage().Close(), 0);
		staticwait(5000);
	}
	public void clickgotocartBtn() {
		clickTheElement(driver,pa.getSearchpage().getGoToCartBtn(), 5);
		}
	public void payment() {
		clickTheElement(driver,pa.getpaymentpage().getProceedToBuy(), 5);
	}
	public void defaddress() {
		clickTheElement(driver, pa.getpaymentpage().getDefaultAddressbtn(), 10);
		staticwait(10000);
	}
	public void radioBtn() {
		clickTheElement(driver,pa.getpaymentpage().getCardRadioBtn() , 5);
		clickTheElement(driver,pa.getpaymentpage().getEnterCardDetail() , 5);
	}
	public void frame() {
		frame(0);
	}
	public void cardnum() {
		passValue(driver, pa.getpaymentpage().getCardsNum(), cr.getCardNum(), 5);
	}
	public void submit() {
		clickTheElement(driver, pa.getpaymentpage().getSubmitBtn(), 5);
	}
	
}
