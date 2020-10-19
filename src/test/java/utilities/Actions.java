package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.WebDriverSingleton.getInstance;

public class Actions {
    static final int WAIT_TIMEOUT=7;
    private static WebDriverWait wait = new WebDriverWait(getInstance(), WAIT_TIMEOUT);

    public static void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
