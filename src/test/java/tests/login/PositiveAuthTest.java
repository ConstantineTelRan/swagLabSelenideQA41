package tests.login;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.login.steps.Steps001;

public class PositiveAuthTest extends TestBase {
    Steps001 steps001;

    @Test
    @Description("Authorization with valid data")
    @Link("https://docs.google.com/document/d/17tn1kNkyNwj_WF3q0J794AiFZxiu44eSThdMqtoDs5g/edit#bookmark=id.wbvt605q3ync")
    @Link(name = "001 Authorization with valid data")
    public void positiveAuth001Test() {
        steps001 = new Steps001();
        steps001.step1();
    }
}
