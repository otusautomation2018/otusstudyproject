package onlyoffice.com.site.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    public static final String PROJECTS_BTN_XPATH = "//a[@class='image-link' and contains(@href, 'projects')]";

    @Step
    public static ProjectsPage goToProjectsPage() {
        $x(PROJECTS_BTN_XPATH).shouldBe(Condition.visible).click();
        return page(ProjectsPage.class);
    }
}
