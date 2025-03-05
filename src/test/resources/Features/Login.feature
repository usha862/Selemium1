Feature: Login


  Scenario: Successful login with valid Credentials
    Given User launch Chrome browser
    When User opens URL "https://rahulshettyacademy.com/client"
    And User enters Email as "ushab123@gmail.com" and password as "IamHere!!89"
    And Click on login
    And close the browser