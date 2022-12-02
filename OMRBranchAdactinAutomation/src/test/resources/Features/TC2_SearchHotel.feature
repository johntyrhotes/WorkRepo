@SearchHotel
Feature: Verifying Adactin Search Hotel Details

  Scenario Outline: Verifying Adactin Search Hotel Page with all Fields to Navigate to Select Hotel Page
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 28/08/2022  | 29/08/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying Adactin Search Hotel Page with Mandatory Fields to Navigate to Select Hotel Page
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using Mandatory Fields "<location>","<nuberOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User Should Navigate to Select Hotel and Verify the Success Message "Select Hotel"

    Examples: 
      | username   | password    | location | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | 2 - Two      | 28/08/2022  | 29/08/2022   | 2 - Two       |

  Scenario Outline: Verifying Adactin Search Hotel Page by Date Checking
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Needs to Search Hotel Using "<location>","<hotels>","<roomType>","<nuberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User Should Verify After Search with the Date Error Message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username   | password    | location | hotels      | roomType | nuberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | johntyrhot | johnty@1999 | Sydney   | Hotel Creek | Deluxe   | 2 - Two      | 28/08/2024  | 20/08/2022   | 2 - Two       | 1 - One         |

  Scenario Outline: Verifying Adactin Search Hotel Page Without Entering Any Fields
    Given User is on the Adactin Page
    When User Should Perform Login "<username>","<password>"
    Then User Should Verify after Login "Hello johntyrhot!"
    When User Should Click Search Button Without Entering any Fields
    Then User Should Verify After Search with the Error Message "Please Select a Location"

    Examples: 
      | username   | password    |
      | johntyrhot | johnty@1999 |
