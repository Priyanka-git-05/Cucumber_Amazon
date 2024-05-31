Feature: Amazon Login

Scenario: Login with Valid Username And Password

Given Launch The Amazon URL 
When Click The Signin Button It Navigate To Signin Page
And Enter A Valid Mobile Number 
And Click On The Continue Button It Should Navigate To The Password Page
And Enter A Valid Password
And Click On the SignIn Button It Should Navigate To The Amazon Home Page

Scenario Outline: User Search Product In Amazon HomePage And Add TO Cart

When Enter A Product "<productname>" 
And Click On The Search Icon
And Click The Product 
Then Navigated To New Window
And Scrolling Down For Visibility of Cart Button
And Click The Add TO Cart Button
Then Go To Cart And Validate

Examples:
|productname|
|dell 15|
|acer aspire 7|
|hp pavilion 15|

Scenario Outline: Check Out Payment For The Selected Products

When Click On The Proceed To Buy Button That navigates to Check Out Payment Page
And Click On The Default Address Button
And Scrolling Down For Payment Visibility
And Select The Payment Method AS Credit Card And Enter The Card Details Button
And Switches To Frame
And FillCard Details And Press Submit Button

