package onlyoffice.com.tests;

import onlyoffice.com.steps.LoginStep;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginStep loginStep = new LoginStep();
        loginStep.login("enter@your.email", "password");
    }
}
