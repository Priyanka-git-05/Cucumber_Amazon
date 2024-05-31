Feature: Facebook Login
Scenario Outline: User Login With Username and Password

Given User Navigated To Facebook Login Page
When User Enter A Username In Respective Field "<username>"
And User Enter A Password In The Respective Field "<password>"
And User Click On The Login Button It Should Navigate To Facebook Home Page
Then User Successfully Navigated To Facebook Home Page

Examples:

|username|password|
|pavithra|pavi484|
|yakshith|yak123|