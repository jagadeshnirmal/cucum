
Feature: To validate the Login Functionality of Facebook Application
@sanity
Scenario: To validate the invalid email and valid password

Given User have to lanuch the facebook application through chrome browser

When User have to enter invalid email and valid password

|email|pass|
|pass|anu|
|name|nirm|
|age|28|

And User have to click login button
Then User have to reach invalid credential page 

@sanity
Scenario: To validate the invalid email and invalid password

Given User have to lanuch the facebook application through chrome browser

When User have to enter invalid email and invalid password

|email|pass|jaga|anu|

And User have to click login button



Then User have to reach invalid credential page 





