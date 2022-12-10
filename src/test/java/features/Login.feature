Feature: login to application

@login
  Scenario: login to ecommerce application
    Given User is on url "https://admin-demo.nopcommerce.com"
    When user enters login credentials as below
      | Sr. No. | emails              | password |
      |      01 | admin@yourstore.com | admin    |
      |      02 | abc@gmail.com       | xyz@123  |
    When User click on login button
    Then validate User successfully logged in application

@login @sanity @reg @payment
 Scenario: Default status of checkbox
 	Given User is on url "https://admin-demo.nopcommerce.com"
 	Then validate rememberme checkbox status