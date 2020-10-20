Purpose
The purpose of this task was to create an automated test for user registration process on a test page at automationpractice.com

Tools used
The projects uses Maven to integrate with external libraries. Automatic tests are written in Java with Selenium. Chrome Web Driver is downloaded automatically using WebDriverManager(https://github.com/bonigarcia/webdrivermanager). Test data for the registration form is created using DataFaker (https://github.com/DiUS/java-faker). Allure is used as a tool to display the test results as a report

How to use
Download or clone the repository to local and import it to your favorite IDE. In terminal type "maven clean test" in order to execute the tests. Then run "mvn allure:serve" to generate the test report.

Classes
The classes are organized into three packages. Config package defines web driver singleton and it's configuration, that is run before each test. Each page from the website has it's own class in which methods specific for that class are defined. Finally the RegistrationTest in tests package uses the methods from pages and runs the tests.

Further extensions
Additional validations can be added to the user registration test suite. These can include too short password or improper e-mail format.
Allure reports can be extended with screenshots taken upon completion of each test case.
