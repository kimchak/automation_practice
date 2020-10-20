Purpose
The purpose of this task was to create an automated test for user registration process on a test page at automationpractice.com

Tools used
The projects uses Maven to integrate with external libraries. Automatic tests are written in Java with Selenium. Chrome Web Driver is downloaded automaticaly using WebDriverManager(https://github.com/bonigarcia/webdrivermanager). Test data for the registration form is created using DataFaker (https://github.com/DiUS/java-faker). Allure is used as a tool to display the test results as a report

How to use
Download or clone the repository to local and import it to your favorite IDE. In terminal type "maven clean test" in order to execute the tests. Then run "mvn allure:serve" to view the test raport  