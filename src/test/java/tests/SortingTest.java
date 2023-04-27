package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.product.steps.Steps005;

public class SortingTest extends TestBase {
    Steps005 steps005;

    @BeforeMethod
    public void precondition() {
        steps005 = new Steps005();
        steps005.getLogin();
    }

    @Test
    public void sortingTest() {
        steps005.step1();
//        steps005.step2();
        steps005.step4();
    }

}
