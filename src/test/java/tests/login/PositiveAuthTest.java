package tests.login;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.login.steps.Steps001;

public class PositiveAuthTest extends TestBase {
    Steps001 steps001;

    @Epic("Login tests")
    @Feature("Positive login test")
    @Test(description = "Authorization with not valid password")
    @Description("Authorization with valid data")
    @Link("https://github.com/ConstantineTelRan/swagLabSelenideQA41/blob/master/src/test/resources/test_cases/001_Authorization_with_valid_data.md")
    @Link(name = "001 Authorization with valid data")
    public void positiveAuth001Test() {
        steps001 = new Steps001();
        steps001.step1();
    }
}
