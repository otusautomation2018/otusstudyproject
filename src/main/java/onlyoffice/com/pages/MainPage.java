package onlyoffice.com.pages;

import onlyoffice.com.pages.components.homePage.HeaderBlock;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private HeaderBlock headerBlock;

    public static final String MAIN_PAGE_URL = "https://www.onlyoffice.com/";

    public static MainPage enterToMainPage(){
        open(MAIN_PAGE_URL);
        return page(MainPage.class);
    }

    public LoginPage clickOnLoginButton(){
        $x(headerBlock.LOGIN_BTN_XPATH).click();
        return page(LoginPage.class);
    }
}
