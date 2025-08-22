Feature: Login functionality for Zero Bank website

Scenario Outline: User attempts to log in with different credentials
    Given login page should be open in default browser
    When click on login button and enter <username1>
    And  add <password1>
    And  click on signin button check <status>
    Then login successfully and open home page

    Examples:
      |username1|password1|status|
      |dduZHKDi|xilzIizb|Invalid login|
      |12883817|password|Invalid login|
      |username|1271762625|Invalid Login|
      |username|password|logged in|