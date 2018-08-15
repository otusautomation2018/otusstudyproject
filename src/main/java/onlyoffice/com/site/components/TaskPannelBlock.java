package onlyoffice.com.site.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import onlyoffice.com.entities.Task;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class TaskPannelBlock {

    private static final String TASK_NAME_INPUT_XPATH = "//input[@class='textEdit']";
    private static final String DESCRIPTION_INPUT_XPATH = "//div[contains(@class, 'block')]/textarea";
    private static final String START_DATE_INPUT_CSS = "#taskStartDate";
    private static final String END_DATE_INPUT_CSS = "#taskDeadline";

    private static final String CHOOSE_PROJECT_LINK_XPATH = "//div[@data-id and @style]";
    private static final String EXISTED_PROJECTS_XPATH = "//ul[@class='advanced-selector-list']/li[1]";

    public static final String SAVE_BTN_CSS = "#saveTaskAction";


    @Step
    public static TaskPannelBlock fillTaskFields(){
        Task myTask = new Task();
        myTask.testDataTask();
        $x(TASK_NAME_INPUT_XPATH).setValue(myTask.taskName);
        $x(DESCRIPTION_INPUT_XPATH).setValue(myTask.taskDescription);
        $(START_DATE_INPUT_CSS).setValue(myTask.startDate);
        $(END_DATE_INPUT_CSS).setValue(myTask.endDate);
        return page(TaskPannelBlock.class);
    }

    @Step
    public static TaskPannelBlock chooseProject(){
        $x(CHOOSE_PROJECT_LINK_XPATH).click();
        //TODO
        /**   ElementsCollection myArr = $$x(EXISTED_PROJECTS_XPATH);

        int itemIndex = 0;
        try {
            itemIndex = (int)(Math.random()*myArr.size());

        } catch (Exception ex) {}*/
        $x(EXISTED_PROJECTS_XPATH).shouldBe(Condition.visible).click();
        return page(TaskPannelBlock.class);
    }

    @Step
    public static void submitNewTask() {
        $(SAVE_BTN_CSS).click();
    }
}
