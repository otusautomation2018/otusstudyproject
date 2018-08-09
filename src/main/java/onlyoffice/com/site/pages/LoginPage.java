package onlyoffice.com.site.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    /* Login form block */
    public static final String EMAIL_INPUT_CSS = "#txtSignInEmail";
    public static final String PASSWORD_INPUT_CSS = "#txtSignPassword";
    public static final String LOGIN_BTN_XPATH = "//input[@type='button' and @onclick]";

    @Step
    public LoginPage fillEmailInput(String data) {
        $(EMAIL_INPUT_CSS).setValue(data);
        return this;
    }

    @Step
    public LoginPage fillPasswordInput(String data) {
        $(PASSWORD_INPUT_CSS).setValue(data);
        return this;
    }

    @Step
    public HomePage clickLoginBtn() {
        $x(LOGIN_BTN_XPATH).click();
        return Selenide.page(HomePage.class);
    }

    @Step
    public HomePage loginAs(String email, String password) {
        this.fillEmailInput(email);
        this.fillPasswordInput(password);
        this.clickLoginBtn();
        return Selenide.page(HomePage.class);
    }
}
