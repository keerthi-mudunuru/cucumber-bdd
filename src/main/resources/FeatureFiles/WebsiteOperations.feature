Feature: Website Operations

Scenario: Search for a product in the site

Given Navigate to "https://www.amazon.in/" webpage
When Search for "boat wireless headphones" in the box
And Click on the Search button
Then Click on the first result from the results