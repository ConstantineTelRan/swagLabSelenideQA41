package tests.login;

import org.testng.annotations.Test;
import tests.TestBase;
import tests.login.steps.StepsPositiveAuth;

public class PositiveAuthTest extends TestBase {
    StepsPositiveAuth stepsPositiveAuth;

    @Test
    public void positiveAuthTest() {
        stepsPositiveAuth = new StepsPositiveAuth();
        stepsPositiveAuth.step1();
    }

}
