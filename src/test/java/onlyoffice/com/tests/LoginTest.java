package onlyoffice.com.tests;

import onlyoffice.com.steps.NavigationSteps;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        NavigationSteps.loginWithValidCredentials();
    }
}
