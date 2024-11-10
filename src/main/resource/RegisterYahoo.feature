Feature: Register functionality
@Register
Scenario: User creates an account with manadatory fields
Given user naviagtes to signUp  Account page
When user enters the details into below fields
|firstnames|mahaboobshareef|
|lastname  |sayed|
|email     |mahaboobshareef787|
|password  |9603205826Mabu@|
|DOBMonth  |June|
|DOBDate   |20|
|DOBYear   |1991|
And user clik on next button
And user enters phoneNumber As "9603205826" 
And user clicks on Phonenumber Text
And user clicks on Captcha button
And user clicks on Verify Captcha button
And user clikcs on Verify Code text
And user account should get successful welcome to Yahoo
And user clikcs on Select CheckbBox
Then user clikcs on Done button


