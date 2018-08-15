package onlyoffice.com.tests;

import onlyoffice.com.site.pages.ProjectsPage;
import onlyoffice.com.steps.CreatingSteps;
import onlyoffice.com.steps.NavigationSteps;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CreateTaskUITest extends BaseTest {

    @Test
    public void createTaskTest(){
        NavigationSteps.loginWithValidCredentials();
        CreatingSteps.createNewTask();
        assertTrue(ProjectsPage.taskWasCreated());
    }
}
