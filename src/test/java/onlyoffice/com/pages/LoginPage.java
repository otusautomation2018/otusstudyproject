package onlyoffice.com.pages;

import onlyoffice.com.pages.components.loginPage.LoginFormBlock;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    private LoginFormBlock loginFormBlock;

    public LoginPage fillEmailInput(String data) {
        $(loginFormBlock.EMAIL_INPUT).setValue(data);
        return this;
    }

    public LoginPage fillPasswordInput(String data) {
        $(loginFormBlock.PASSWORD_INPUT).setValue(data);
        return this;
    }

    public HomePage clickLoginBtn() {
        $x(loginFormBlock.LOGIN_BTN).click();
        return page(HomePage.class);
    }

    public HomePage loginAs(String email, String password) {
        this.fillEmailInput(email);
        this.fillPasswordInput(password);
        this.clickLoginBtn();
        return page(HomePage.class);
    }
}
