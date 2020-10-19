package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static config.WebDriverSingleton.*;
import static utilities.Actions.*;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(getInstance(), this);
        waitForElement(content);
    }

    @FindBy(id="columns")
    private WebElement content;
}
