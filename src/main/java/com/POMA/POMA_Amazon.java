package com.POMA;

import com.BaseClass.BaseClass;
import com.POM.Amazon_Login_POM;
import com.POM.Amazon_Payment_POM;
import com.POM.Amazon_Search_POM;

public class POMA_Amazon extends BaseClass {

	private Amazon_Login_POM al;
	private Amazon_Search_POM as;
	private Amazon_Payment_POM ap;
	
	public Amazon_Login_POM getloginpage() {
		if(al==null) {
			al= new Amazon_Login_POM(driver);
		}
		return al;
	}
	public Amazon_Search_POM getSearchpage() {
		if(as==null) {
			as= new Amazon_Search_POM(driver);
		}
		return as;
	}
	public Amazon_Payment_POM getpaymentpage() {
		if(ap==null) {
			ap= new Amazon_Payment_POM(driver);
		}
		return ap;
		
	}
	
}
