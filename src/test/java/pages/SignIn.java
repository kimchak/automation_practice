package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class SignIn extends BasePage {
    @FindBy(id = "email_create")
    private WebElement emailInput;
    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    public SignIn() {
        super();
    }

    @Step
    public Registration registerWithEmail(String email) {
        emailInput.sendKeys(email);
        submitButton.click();
        return new Registration();

    }


}
