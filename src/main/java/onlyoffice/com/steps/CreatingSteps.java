package onlyoffice.com.steps;

import io.qameta.allure.Step;
import onlyoffice.com.site.pages.HomePage;
import onlyoffice.com.site.pages.ProjectsPage;

public class CreatingSteps {

    @Step
    public static void createNewTask(){
        HomePage.goToProjectsPage();
        ProjectsPage.isInitialized();
        ProjectsPage.callCreateNewTaskWindow();
        ProjectsPage.createNewTask();
    }
}
