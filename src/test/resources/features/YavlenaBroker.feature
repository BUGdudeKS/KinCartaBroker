Feature: Yavlena broker dashboard
  User Story: As a User I want to be able to display more Brokers and their information


  Scenario: Title verification
    Given user is on the Yavlena dashboard
    Given user clicks on ENG flag to translate the page
    Then user should see title is as expected

   #expectedTitle: Our team | Yavlena


  Scenario: Loading more Brokers
    Given user is on the Yavlena dashboard
    Given user click on Load more button
   # Then verify there are more brokers

  Scenario: Looping thru all brokers
    Then for each broker on the page, search by the broker's name
    #And verify that the searched broker is the only one displayed
   # And verify the address, landline phone, mobile phone, and number of properties for the broker