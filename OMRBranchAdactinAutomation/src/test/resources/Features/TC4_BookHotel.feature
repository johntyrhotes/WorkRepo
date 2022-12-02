@BookHotel
Feature: Verifying Adactin Book Hotel Details

  Scenario Outline: Verifying Adactin Book Hotel Page to Generate the Order Number
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"
    When User Should Select a Hotel and Click Continue Button
    Then User Should Navigate to Book Hotel and Verify the Message "Book A Hotel"
    When User Needs to Book a Hotel Using "<firstName>","<lastName>","<billingAddress>" and Credit Card Details
      | ccNum            | ccType           | expiryMonth | expiryYear | CVV |
      | 9876543210987654 | American Express | September   |       2022 | 101 |
      | 7775620510768399 | VISA             | October     |       2022 | 202 |
      | 5305620510768399 | Master Card      | November    |       2022 | 303 |
      | 9876543210987654 | Other            | December    |       2022 | 404 |
    Then User Should Verify the Success Message of "Booking Confirmation" After Book Hotel

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName     | lastName | billingAddress |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 29/08/2022  | 30/08/2022   | 2 - Two       | 1 - One         | Johnty Rhotes | Johnson  | Dindigul       |

  Scenario Outline: Verifying Adactin Book Hotel Page Without Entering Any Fields
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"
    When User Should Select a Hotel and Click Continue Button
    Then User Should Navigate to Book Hotel and Verify the Message "Book A Hotel"
    When User Click Book Now Without Enter any Fields
    Then User Should Verify the Error Message of "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number" After Click Book Now

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 29/08/2022  | 30/08/2022   | 2 - Two       | 1 - One         |
