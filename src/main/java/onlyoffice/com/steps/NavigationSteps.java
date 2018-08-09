package onlyoffice.com.steps;

import io.qameta.allure.Step;
import onlyoffice.com.data.CommonForTheSiteData;
import onlyoffice.com.data.PagesRouting;
import onlyoffice.com.entities.User;
import onlyoffice.com.site.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationSteps {

    @Step
    public static void login(User user) {
        open(PagesRouting.LOGIN_PAGE_URL);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(user.email, user.password);
    }

    @Step
    public static void loginWithValidCredentials(){
        login(User.createFromFile(CommonForTheSiteData.PATH_TO_USER_DATA_FILE));
    }
}
