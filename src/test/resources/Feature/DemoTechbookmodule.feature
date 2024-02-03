Feature: Verify book module

  #Author:karthik manivel
  Scenario: login validation
    Given Enter the Url of website
    When Enter valid Email and password <"elon06820@gmail.com"> and <"karthik22">
    And Log in Successfully
    And click on the book module
    And click on the add to cart for book1
    And click on add to cart for book2
    Then logout from the website
