Feature: Searching products 

Scenario Outline: Searching products on google


Given I am on the google homepage

When i enter the "<product name>" 
And i click the search button


Then I see the realted search results successfully

Examples:
|product name|
|Football    |
|computer    |
|toys        |

