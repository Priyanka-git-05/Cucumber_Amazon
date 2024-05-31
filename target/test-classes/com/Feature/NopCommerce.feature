Feature: Userlogin and modifying new customers

Background: 
Given User launching the browser
When User launching the nopCommerce webpage
And User enters email as "admin@yourstore.com" and password as "admin" 
And User click the login button redirects to nopCommerce homepage
And User should click the customers present under dashboard
And User should choose customers options in customers list

@Add
Scenario: Adding new customer

And User click add new button
Then User navigated and "Add a new customer" page is displayed
And Enter email as "yak@123" and password as "Yak#123"
And Enter firstname as "Yak" and lastname as "shith"
And Choose gender as male
And Choose DOB from calender and company name as "Infosys"
And Choose newsletter as your store name ,customer roles as guests
And Choose vendor manager as Vendor1 and click active 
And Enter "This page is currently controlled by automated test software using cucumber framework"in admin comments
Then Receiving "" message 
And User click logout button

@Edit
Scenario: Perform editing in the customer list
And User should choose Victoria Terces in customer list and click on the edit button
And User redirected to "Edit customer details - Terces Victoria" page
And Enter new password and click change password button
Then "The password has been changed successfully."message displayed 
And Choose gender as female
And Enter "Editing this page" in admin comments
And Click on orders and change items to 50
And Click on place order button
Then Redirected and received "You do not have permission to perform the selected operation."message
And User click logout button

@Delete
Scenario: Delete item in customer list
And Choose Steve Gates in customer list and click on the edit button
Then User navigated to "Edit customer details - Gates Steve" page
And Click send email button
And Send "Greet Message" in the subject
And Pass "Hi Steves , Have a good day " in email body
And Click send email button
And Click delete button and confirm 
And User recieves "The customer has been deleted successfully." meesage










