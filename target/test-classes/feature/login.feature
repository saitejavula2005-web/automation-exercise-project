Feature: login functionality  
Scenario: login
Given i should launch browser
When Navigate to url "http://automationexercise.com"
Then Verify that home page is visible successfully
When Click on Signup / Login button
Then conform  "Login to your account" is visible
When Enter  email as "saitej4253@gmail.com"
When enter the password as "saitej"
 And press  "login" button
 Then conform text "Logged in as username" is visible
 When press  "Delete Account" button
 Then conform  that "ACCOUNT DELETED!" is visible