package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage{
    public HomePage(){super();}

    @FindBy (css = "[title=\"Log in to your customer account\"]")
    private WebElement signInButton;

    @Step
    public SignIn openSignInPage() {
        signInButton.click();
//        captureScreenshot();

        return new SignIn();
    }


}
