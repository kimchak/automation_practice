package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriver driver;
    private WebDriverSingleton(){};

    public static WebDriver getInstance(){
        if (driver==null){
//            WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().version("86.0.4240.22").setup();

            driver = new ChromeDriver();

        }
        return driver;
    }

    public static void quit(){
        if(driver!=null){
            driver.quit();
        }
        driver = null;
    }
}
