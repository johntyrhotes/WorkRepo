@Login
Feature: Verifying AdactinHotel Login Hotel Details

  Background: 
    Given user is just checking

  @Login1 @Login2
  Scenario Outline: Verifying Adactin Login with Valid Credentials
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"

    Examples: 
      | username   | password    |
      | johntyrhot | johnty@1999 |

  Scenario Outline: Verifying Adactin Login with Valid Credentials with Enter
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>" with Enter Key
    Then User Should Verify after Login "Hello johntyrhot!"

    Examples: 
      | username   | password    |
      | johntyrhot | johnty@1999 |

  Scenario Outline: Verifying Adactin Login with Invalid Credentials
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login error contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | username    | password    |
      | johntyrhots | johnty@1999 |
