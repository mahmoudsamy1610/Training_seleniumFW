
Feature: UserRegistration
I want to check that the user can register in our e-commerce website


Scenario Outline: User needs to Register

Given the user should be in the home page
When he clicks on register link
When he enters user data "<FN>"  "<LN>"  "<Email>"  "<pass>"
Then the registeratoin page displayed successfully  


Examples:
|    FN       |LN        |Email            |pass         |
|mahmou112d   |sa1223my   |s1232amy@gmail.com |1231234324   |
|mahmou1223d2 |sam1223y2  |samy21232@gmail.com|12312234324  |
|mahmo1232ud3 |sam2213y3  |sam1223y3@gmail.com|123134234324 |