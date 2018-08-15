package onlyoffice.com.site.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import onlyoffice.com.site.components.TaskPannelBlock;

import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage {

    private TaskPannelBlock taskPannelBlock;
    private static String expectedTaskName;

    private static final String PROJECTS_DROPDOWN_XPATH = "//a[@class='product-cur-link']";
    private static final String FILTER_XPATH = "//input[contains(@class,'advansed-filter')]";
    private static final String CREATE_ITEM_DROPDOWN_XPATH = "//*[@id='menuCreateNewButton']/span[2]";
    private static final String CREATE_TASK_LINK_CSS = "#createNewTask";
    private static final String CREATE_TASK_PANNEL_CSS = "#addTaskPanel";
    private static final String ALL_TASK_NAMES_XPATH = "//a[@class='linkHeaderMedium']";

    @Step
    public static ProjectsPage isInitialized(){
        $x(PROJECTS_DROPDOWN_XPATH).shouldBe(Condition.appear);
        $x(FILTER_XPATH).shouldBe(Condition.appear);
        return page(ProjectsPage.class);
    }

    @Step
    public static ProjectsPage callCreateNewTaskWindow(){
        $x(CREATE_ITEM_DROPDOWN_XPATH).click();
        $(CREATE_TASK_LINK_CSS).shouldBe(Condition.visible).hover().click();
        $(CREATE_TASK_PANNEL_CSS).shouldBe(Condition.visible);
        return page(ProjectsPage.class);
    }

    @Step
    public static ProjectsPage createNewTask(){
        expectedTaskName = TaskPannelBlock.fillTaskFields();
        TaskPannelBlock.chooseProject();
        TaskPannelBlock.submitNewTask();
        return page(ProjectsPage.class);
    }

    @Step
    public static boolean taskWasCreated(){
        $(CREATE_TASK_PANNEL_CSS).shouldBe(Condition.disappear);
        ElementsCollection allTasks = $$x(ALL_TASK_NAMES_XPATH);
        System.out.println(expectedTaskName);
        for (int i = 0; i < allTasks.size(); i++) {
            String taskName = allTasks.get(i).innerText();
            System.out.println(taskName);
            if (taskName.equals(expectedTaskName)) {
                return true;
            }
        }
        return false;
    }
}
