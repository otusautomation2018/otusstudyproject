package onlyoffice.com.site.pages;

import io.qameta.allure.Step;
import onlyoffice.com.data.PagesRouting;
import onlyoffice.com.site.components.HeaderBlock;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    private HeaderBlock headerBlock;

    @Step
    public static MainPage enterToMainPage(){
        open(PagesRouting.MAIN_PAGE_URL);
        return page(MainPage.class);
    }

    @Step
    public LoginPage clickOnLoginButton(){
        $x(headerBlock.LOGIN_BTN_XPATH).click();
        return page(LoginPage.class);
    }
}
