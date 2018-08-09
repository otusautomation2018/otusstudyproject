package onlyoffice.com.steps;

import onlyoffice.com.entities.User;
import onlyoffice.com.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginStep {

    public static final String LOGIN_PAGE_URL = "https://www.onlyoffice.com/ru/signin.aspx";

    public void login(User user) {
        open(LOGIN_PAGE_URL);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(user.email, user.password);
    }
}
