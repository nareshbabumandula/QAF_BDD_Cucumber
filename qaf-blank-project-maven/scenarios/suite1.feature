Feature: Google Search

  Scenario: TC001 Verify the functionality of accessing makemytrip portal
    Given get '/' 
    When search for 'makemytrip'
    And verify link with partial text 'Make' is present
    And i click on the link displayed in the results
    Then i verify the makemytrip logo is displayed in makemytrip homepage


  Scenario: TC002 Verify the functionality of flight search in makemytrip portal
    Given get '/'
    When search for 'makemytrip'
    And verify link with partial text 'Make' is present
    And i click on the link displayed in the results
    And i click the flight search button
    Then i verify the flight search results
    
#Scenario: Verify the functionality of searching a store based on City
#  Given As a customer/patient
#  When I want to search a Store by State, City, and Zipcode
#  Then So that I can see the store details