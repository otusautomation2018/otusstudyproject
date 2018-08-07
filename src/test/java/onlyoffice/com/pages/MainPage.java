package onlyoffice.com.pages;

import onlyoffice.com.pages.components.homePage.HeaderBlock;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private HeaderBlock headerBlock;

    public static MainPage enterToMainPage(){
        open("http://www.onlyoffice.com/");
        return page(MainPage.class);
    }

    public LoginPage clickOnLoginButton(){
        $x(headerBlock.LOGIN_BTN).click();
        return page(LoginPage.class);
    }
}
