package onlyoffice.com.tests;

import org.testng.annotations.Test;

import static onlyoffice.com.pages.MainPage.enterToMainPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        enterToMainPage()
                .clickOnLoginButton()
                .loginAs("enter@your.email", "password");
    }
}
