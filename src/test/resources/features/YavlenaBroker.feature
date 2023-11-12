@Regression
Feature: Searching the Agents name and verifying Informations

  Background:
    Given user is on the dashboard of Yavlena brokers
@smoke @TC1
    Scenario Outline:
      When user clicks on the search box
      And user write the agents "<fullName>" in the search box
      Then verify the information is displayed from the Agents

      |address  |mobile phone  | landline phone | number of properties   |
      |<address>|<mobile phone>| <landline phone>| <number of properties>|

      Examples:
     |fullName             |address                            |mobile phone     |landline phone     |number of properties |
     |Desisilava Petrova   |Blagoevgrad, Office Blagoevgrad    |+359 73 88 20 05 |+359 886 880 290   |(12 Properties)      |
     |Gergana Ivancheva    |Blagoevgrad, Office Blagoevgrad    |+359 73 88 20 04 |+359 886 880 290   |(0 Properties)       |
     |Radoslav Andonov     |Blagoevgrad, Office Blagoevgrad    |+359 73 882 004  |+359 886 880 290   |(60 Properties)      |
     |Magdalena Stoyanova  |Burgas, Office Burgas              |+359 56 878 008  |+359 885 777 73    |(23 Properties)      |


@smoke @TC2
      Scenario: Selecting "Load more" button to reveal all agents
        When user click to Load more button
        Then  verify that the number of agents are increased
