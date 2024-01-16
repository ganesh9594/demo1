Feature: Test the HRM Application

Scenario: Test The Brower Functionality
Given user enter the "chrome" browser and open login url 

Scenario: Test The Login Functionality 
When User Enter The Valid Credential and Login The URL
Then User Validate Title 
And User Validate the URL
				
				#Scenario Outline: PIM Page Functionality
				#When USer Click On PIM Link
				#And User validate url by using url 
				#|PIM|
				#And User click on addemployee link and enter "<firstname>","<lastname>" and click on save buttton 
				#And Capture the Employee ID and Click on Search button 
				#And Select the search search employee and click on delete 
				#And Validate user is Deleted or not   
				
				#Examples:
				#|firstname|lastname|
				#|Ganesh|Mahadik|
				#|Ravi|Shinde|
