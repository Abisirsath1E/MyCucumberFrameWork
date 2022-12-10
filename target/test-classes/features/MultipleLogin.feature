Feature: login to application with multiple users

@reg @sanity @reg
  Scenario Outline: login to ecommerce application
    Given User is on url "https://admin-demo.nopcommerce.com"
    When user enters login credentials as '<email>' and '<password>'
    When User click on login button
    Then validate User successfully logged in application

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | abc@gmail.com       | xyz@123  |
      