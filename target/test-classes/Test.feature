Feature: Testing pricemesh
  Verifing Scenarios for VoterSurvey Website



  @Votersurvey
  Scenario Outline: Voter survey automation test
    Given Launch chrome Browser for votersurvey Website
    Then Enter mobile number
    Then Click next in mobileNumber Page
    Then Click countinue in 2nd Page
    Then Enter verificationCode
    Then Click countinue for verificationCode
    Then Select any of the Street in the List
    Then Select any one of the Voter in the List
    Then Click grouping button after selecting voter
    Then Choose party for the selected voter
    Then Click countinue after choosing party for the voter
    Then Choose religion for the selected voter
    Then Click save after selecting party and religion for the voter
    Then Assert grouped voter
    Then Click back button
    Then Get count of total grouped count after grouping
    Then Assert Count
    Then Quit from the Website

    Examples:
      | Website   |
      | VoterSurvey |



  @TagSmoke
  Scenario Outline: Scenario Outline name: Verify Selected items are refreshed when we change the indicator single to other main item.
    Given Launch chrome Browser for pricemesh Website
    Then Assert tile of the website
    Then Change language to "English" toggle
    Then Changing Context to second position
    Then verify whether all the selected items are deselected
    Then verify whether all the selectedSingle items are deselected
    Then Quit from the Website

    Examples:
      | Website   |
      | PriceMesh |

  @TagSmoke
  Scenario Outline: Scenario Outline name: Verify Whether the same selected items are displaying in GraphView [English] [indicated Single Label]
    Given Launch chrome Browser for pricemesh Website
    Then Assert tile of the website
    Given Wait for "1" seconds
    Then Change language to "English" toggle
    Then Check whether only the selected main lable items are displayed in graph view
    Then Quit from the Website

    Examples:
      | Website   |
      | PriceMesh |

  @TagSmoke
  Scenario Outline: Scenario Outline name: Verify whether Only one main lable has multiple selecting permission
    Given Launch chrome Browser for pricemesh Website
    Then Assert tile of the website
    Given Wait for "1" seconds
    Then Change language to "English" toggle
    Then Check for Main Labels where only one should have multiple selector permission
    Then Quit from the Website


    Examples:
      | Website   |
      | PriceMesh |


  @TagSmoke
  Scenario Outline: Asserting Website's title
    Given Launch chrome Browser for pricemesh Website
    Then Assert tile of the website
    Then Quit from the Website

    Examples:
      | Website   |
      | PriceMesh |


  @TagSmoke
  Scenario Outline: Verify by adding items and click submit and assert the graph.
    Given Launch chrome Browser for pricemesh Website
    Then Assert tile of the website
    Then Change language to "English" toggle
    # Values for below line choose between Commodity or City or Company
    Given Click search of "Commodity" button
    Then Enter "Mango" value in search field
    Then Choose searched value
    Given Wait for "5" seconds
    Then Click searchField Clear button
    Given Click search of "City" button
    Then Enter "Coimbatore" value in search field
    Then Choose searched value
    Given Wait for "1" seconds
    Then Click searchField Clear button
    Given Click search of "Company" button
    Then Enter "BigBasket" value in search field
    Then Choose searched value
    Given Wait for "1" seconds
    Then Click searchField Clear button
    Then Click Submit button
    Given Wait for "5" seconds
    Then Check whether only the selected main lable items are displayed in graph view
    Then Scroll to alert Element
    Then Quit from the Website

    Examples:
      | Website   | Language |
      | PriceMesh | English  |






