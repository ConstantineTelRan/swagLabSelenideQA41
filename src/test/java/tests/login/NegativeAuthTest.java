package tests.login;

import org.testng.annotations.Test;
import tests.TestBase;
import tests.login.steps.StepsWrongLoginAuth;

public class NegativeAuthTest extends TestBase {
    StepsWrongLoginAuth stepsWrongLoginAuth;

    @Test
    public void authWithWrongLogin() {
        stepsWrongLoginAuth = new StepsWrongLoginAuth();
        stepsWrongLoginAuth.step1();
        stepsWrongLoginAuth.step2();
    }

}
