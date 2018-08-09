package onlyoffice.com.steps;

import onlyoffice.com.pages.HomePage;
import onlyoffice.com.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginStep {

    public static final String LOGIN_PAGE_URL = "https://www.onlyoffice.com/ru/signin.aspx";

    public void login(String email, String password) {
        open(LOGIN_PAGE_URL);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(email, password);
    }
}
