@SelectHotel
Feature: Verifying Adactin Select Hotel Details

  Scenario Outline: Verifying Adactin Select Hotel Page to Navigate to Book Hotel Page
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"
    When User Should Select a Hotel and Click Continue Button
    Then User Should Navigate to Book Hotel and Verify the Message "Book A Hotel"

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 29/08/2022  | 30/08/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying Adactin Select Hotel Page Without Select a Hotel
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"
    When User Click Continue Without Select Any Hotel
    Then User Should Verify After Search with the Error Message of "Please Select a Hotel"

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 29/08/2022  | 30/08/2022   | 2 - Two       | 1 - One         |
