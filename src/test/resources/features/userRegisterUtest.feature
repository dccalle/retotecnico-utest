#Autor: Catalina Calle
@stories
Feature: Register new user on Utest
  As a new user, I want to register on Utest Platform
  @scenario1
  Scenario: Successful new user registration
    Given than Catalina wanst to register on Utest
    When  She fills in the registration form
      |strfirtName|strlastName|strEmail               |strbirthMonth|strbirthDay|strbirthYear|strCity |strZip|strCountry|strPcOs|strPcOsVersion|strPcOsLanguage|strPhoneBrand|strPhoneModel|strPhoneOS|strPassword|
      |Diana      |Gonzalez   |ccalle@utest.com       |June         |6          |1989        |Monteria|230002|Colombia  |Windows|Windows 10    |Spanish        |Samsung      |Galaxy A50   |Android 11|Choicai2021*|
    Then  Registration is complete when the Complete Setup button is clicked
      |strCompleteSetup |
      |Complete Setup   |
