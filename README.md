# auto-skills-techmahindra

## Author: Gerald Anene

## Copyright:
This framework is intended for Techmahindra. However, as it is not deemed to contain any sensitive data that will be in breach of GDPR regulations, no explicit permissions is required for its use by other intended end users. 

## Framework Goals

Although the intention of this project was to click on Test Automation Engineer and verify that 5 skills are listed, the framework is designed with the intention that another career skills besides test automation can also be tested. This satisfies the convention that test automation framework should be designed to be reusable and extensive. 

## SetUp Structure

This framework contains two tests:

1. JUnit Test
2. BDD Tests

Both tests can be run as maven tests with the command: mvn clean tests

## Folder Structure:
- The link to application under test is saved under: src/main/java/utils/Links folder
-The JUnit test can be found under: src/test/java/menuItems/AutomationSkillsTests.java folder
-For the BDD tests:
  -Cucumber runner test runner class can be found under:      src/test/java/cucumber/CucumberOptionsTests
  - The feature files are defined under: src/test/java/cucumber.features
  - The step definitions are defined under: src/test/java/cucumber.stepdefs
  
  
  
  



