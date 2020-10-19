package tests;

import com.github.javafaker.Faker;
import config.TestConfig;
import org.junit.Test;
import pages.HomePage;



public class RegistrationTest extends TestConfig {
    Faker faker = new Faker();
    final String password=faker.internet().password();
    final String email=faker.internet().emailAddress();



    @Test
    public void successfulRegistration(){
        System.out.println(password);
        System.out.println(email);
        new HomePage()
                .openSignInPage()
                .registerWithEmail(email)
                .submitValidForm()
                .registrationFinished();

    }

    @Test
    public void failedRegistration(){
        new HomePage()
                .openSignInPage()
                .registerWithEmail(email)
                .submitInvalidForm();
    }



}
