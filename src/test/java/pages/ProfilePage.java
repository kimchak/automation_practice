package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage(){super();}


        @FindBy(css= "#center_column > h1")
        WebElement profileHeader;

    public void registrationFinished(){
    String expectedText="MY ACCOUNT";
    boolean headerIsDisplayed;
            if (profileHeader.isDisplayed() && (profileHeader.getText() == expectedText)) {headerIsDisplayed = true;}
            else {headerIsDisplayed=false;}

   Assert.assertTrue(headerIsDisplayed=true);}
}

