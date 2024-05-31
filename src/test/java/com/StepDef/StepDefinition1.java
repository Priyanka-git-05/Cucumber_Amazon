package com.StepDef;

import org.openqa.selenium.By;

import com.BaseClass.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {
	
	@Given("User Navigated To Facebook Login Page")
	public void user_navigated_to_facebook_login_page() {
		launchTheBrowser("Chrome");
		launchURL(driver, "https://www.facebook.com/", 0);
		max();
	}

	@When("User Enter A Username In Respective Field {string}")
	public void user_enter_a_username_in_respective_field_pavithra(String username) {
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@And("User Enter A Password In The Respective Field {string}")
	public void user_enter_a_password_in_the_respective_field_pavi484(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@And("User Click On The Login Button It Should Navigate To Facebook Home Page")
	public void user_click_on_the_login_button_it_should_navigate_to_facebook_home_page() {
	   driver.findElement(By.name("login")).click();
	}
	
	@Then("User Successfully Navigated To Facebook Home Page")
	public void user_successfully_navigated_to_facebook_home_page() {
	   System.out.println("User Successfully Navigated To Facebook Home Page");
	}


}
