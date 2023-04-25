package tests.product;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.product.steps.Steps005;

public class SortingTest extends TestBase {
    Steps005 steps005;

    @BeforeMethod
    public void precondition() {
        steps005 = new Steps005();
        steps005.precondition();
    }

    @Test
    public void sortingTest() {
        steps005.step1();
        steps005.step2();
    }

}
