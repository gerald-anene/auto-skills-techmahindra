Feature: Test Automation Skills and Qualifications
  As a user, I should be able to see the 5 different skills and qualifications of a test automation engineer
  
  Scenario: Verify 5 skills of test automation Engineer
  
  Given I am on CTCO home page
  And I hover on "Careers" and click on "Vacancies"
  When I click on "TEST AUTOMATION ENGINEER" link
  Then I should verify that "5" skills of Automation Engineer are displayed
  