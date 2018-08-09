package onlyoffice.com.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void before(){
        Configuration.browser = "chrome";
    }
}
