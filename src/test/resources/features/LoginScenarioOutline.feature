@Smoke
Feature: Login test with user Input

  Scenario Outline: As a Tester I OpenInsatagram App
    Put valid User Name and Password Credentials
    Clivk Login button
    I can be logged in

    Given I enter <browser> and <url> to open app
    When I enter <username> and <password> valid to acces the app
    And I click loginbutton
    Then I can be logged i

    Examples: 
      | browser  | url                          | username | password |
      | "Chrome" | "https://www.instagram.com/" | "Sumon"  | "Ayra4625454"   |
      | "Edge"   | "https://www.instagram.com/" | "Majid"  | "Manha314242"  |
