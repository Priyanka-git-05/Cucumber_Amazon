package com.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	FileInputStream fi ;
	Properties pro = new Properties();
	
	public Config_Reader() {
		File f = new File("D:\\eclipse\\eclipse\\Cucumber\\src\\main\\java\\com\\Property\\dataproperties");
		
		try {
			fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			pro.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		String urlName = pro.getProperty("url");
		return urlName;
	 
	}public String getPassword() {
		String password = pro.getProperty("password");
		return password; 
	}
	public String getmobileNum() {
		String mobileNum = pro.getProperty("mobilenum");
		return mobileNum;
	 
	}
	public String getCardNum() {
		String cardnumber = pro.getProperty("cardnum");
		return cardnumber; 
	}
	

}
