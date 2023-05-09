package tests.header_footer;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.header_footer.steps.Steps007;
import utility.RunTestAgain;

public class FooterTest extends TestBase {
    Steps007 steps007;

    @BeforeMethod
    public void precondition() {
        steps007 = new Steps007();
        steps007.getLogin();
    }

    @Epic("Base page tests")
    @Feature("Footer tests")
    @Test(description = "Check social media links", retryAnalyzer = RunTestAgain.class)
    public void footerSocialLinkTest() {
        steps007.step1();
        steps007.step2();
        steps007.step3();
    }
}
