package com.Amazon;

import com.actions.Action;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends Action{
	@Given("Launch The Amazon URL")
	public void launch_the_amazon_url() {
	    launchUrl();
	}
	@When("Click The Signin Button It Navigate To Signin Page")
	public void click_the_signin_button_it_navigate_to_signin_page() {
	   pressSignIn(); 
	}
	@And("Enter A Valid Mobile Number")
	public void enter_a_valid_mobile_number() {
	    entermobile();
	}
	@And("Click On The Continue Button It Should Navigate To The Password Page")
	public void click_on_the_continue_button_it_should_navigate_to_the_password_page() {
	    clickContinue();
	}
	@And("Enter A Valid Password")
	public void enter_a_valid_password() {
	    enterPass();
	}
	@And("Click On the SignIn Button It Should Navigate To The Amazon Home Page")
	public void click_on_the_sign_in_button_it_should_navigate_to_the_amazon_home_page() {
	    clickSubmit();
	}
	@When("Enter A Product {string}")
	public void enter_a_product(String string) {
		searchProduct1(string);
	}
	@And("Click On The Search Icon")
	public void click_on_the_search_icon() {
	   clickSearchIcon();
	   scrolldown();
	}
	@And("Click The Product")
	public void click_the_product() {
	    clickprod1();
	}
	@Then("Navigated To New Window")
	public void navigated_to_new_window() {
	    window();
	}
	@And("Scrolling Down For Visibility of Cart Button")
	public void scrolling_down_for_visibility_of_cart_button() {
	    scrolldown2();
	}
	@And("Click The Add TO Cart Button")
	public void click_the_add_to_cart_button() {
	   cartBtn();
	}
	@Then("Go To Cart And Validate")
	public void go_to_cart_and_validate() {
	  clickgotocartBtn();
	}
	
	@When("Click On The Proceed To Buy Button That navigates to Check Out Payment Page")
	public void click_on_the_proceed_to_buy_button_that_navigates_to_check_out_payment_page() {
	    payment();
	}
	@When("Click On The Default Address Button")
	public void click_on_the_default_address_button() {
	    defaddress();
	}
	@When("Scrolling Down For Payment Visibility")
	public void scrolling_down_for_payment_visibility() {
	   scrolldown();
	}
	@When("Select The Payment Method AS Credit Card And Enter The Card Details Button")
	public void select_the_payment_method_as_credit_card_and_enter_the_card_details_button() {
	    radioBtn();
	}
	@When("Switches To Frame")
	public void switches_to_frame() {
		frame();
	}
	@When("FillCard Details And Press Submit Button")
	public void fill_card_details_and_press_submit_button() {
	   cardnum();
	   submit();
	}
	
}


