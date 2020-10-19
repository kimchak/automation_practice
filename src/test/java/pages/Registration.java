package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration extends BasePage {
    Faker faker = new Faker();
    @FindBy(id = "id_gender1")
    private WebElement maleTitleRadioBtn;
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstnameInput;
    @FindBy(id = "customer_lastname")
    private WebElement customerLastnameInput;
    @FindBy(id = "passwd")
    private WebElement passwordInput;
    @FindBy(id = "days")
    private WebElement birthdayDaySelect;
    @FindBy(id = "months")
    private WebElement birthdatMonthSelect;
    @FindBy(id = "years")
    private WebElement birthdayYearSelect;
    @FindBy(id = "address1")
    private WebElement addressLineInput;
    @FindBy(id = "city")
    private WebElement cityInput;
    @FindBy(id = "id_state")
    private WebElement stateSelect;
    @FindBy(id = "postcode")
    private WebElement zipCodeInput;
    @FindBy(id = "phone_mobile")
    private WebElement phoneNumberInput;
    @FindBy(id = "submitAccount")
    private WebElement submitFormBtn;
    @FindBy(css = "#center_column > .alert li")
    private WebElement alertList;

    public Registration() {
        super();
    }

    public void fillInRegistrationForm(boolean valid) {
        maleTitleRadioBtn.click();
        if (valid) {
            customerFirstnameInput.sendKeys(faker.name().firstName());
        }
        customerLastnameInput.sendKeys(faker.name().lastName());
        passwordInput.sendKeys(faker.internet().password());
        new Select(birthdayDaySelect).selectByValue("4");
        new Select(birthdatMonthSelect).selectByValue("10");
        new Select(birthdayYearSelect).selectByValue("1980");
        addressLineInput.sendKeys(faker.address().streetName());
        cityInput.sendKeys(faker.address().city());
        new Select(stateSelect).selectByValue("50");
        zipCodeInput.sendKeys("11234");
        phoneNumberInput.sendKeys(faker.phoneNumber().cellPhone());
    }

    public ProfilePage submitValidForm(){
        fillInRegistrationForm(true);
        submitFormBtn.click();
        return new ProfilePage();
    }

    public Registration submitInvalidForm(){
        fillInRegistrationForm(false);
        submitFormBtn.click();
        alertList.isDisplayed();
        return this;
    }
}
