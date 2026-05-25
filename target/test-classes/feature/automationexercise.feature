Feature: registerfunctionalty

  Background:
    Given i should launch browser
    When i navigate to "http://automationexercise.com"
#@smoke
  Scenario: login valid credentials
    Then check whether it  has been navigated
    When i Click on Signup / Login button
    Then check whether it has been verified to new user singup
    When i enter the username as "saiteja"
    And i enter the email as "sa2445233@gmail.com"
    And i Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When i click the title mr
    And i enter the password "sai222"
    And i enter the date of birth "5" ,"November", "2005"
    When Sign up for our newsletter click
    And i enter the first name as "sai"
    And i enter the lastname as "tej"
    And i enter the companyname as "freshers"
    And i enter the adress1 as "vaidhyanadhanstreet"
    And i enter the adress2 as "mintstreet"
    And i enter the country as "Australia"
    And i enter the state as "tamilnadu"
    When i enter the city as "chennai"
    When i enter the zipcode as "600001"
    When i enter the mobile no as "8939348393"
    When i Click Create Account button
    When Click Continue button
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button
# Scenario: login valid credentials
# Given : i should launch browser
# When Navigate to url "http://automationexercise.com"
# Then Verify that home page is visible successfully
# When Click on Signup / Login button
# Then check Login to your account is visible
# When Enter correct email address and password
# And  Click login button
# Then Verify that Logged in as username is visible
# When Click Delete Account button
#@sanity
  #Scenario Outline: user register functionality
   # Then check whether it  has been navigated
    #When i Click on Signup / Login button
    #Then check whether it has been verified to new user singup
    #When i enter the username as "<user>"
    #And i enter the email as "<email>"
    #And i Click Signup button

  #  Examples:
   #   | user    | email                  |
    #  | saiteja | sa#3445233@gmail.com   |
     # | wewr    | vdfvfda                |
      #|         |                        |
      #| 12345   | 1234@                  |
      #| sai     | _@#$%%@#$12_@gmail.com |
