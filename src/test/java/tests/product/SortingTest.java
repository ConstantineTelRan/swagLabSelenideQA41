package tests.product;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.product.steps.Steps005;
import tests.product.steps.Steps006;

public class SortingTest extends TestBase {
    Steps005 steps005;
    Steps006 steps006;

    @BeforeMethod
    public void precondition() {
        steps005 = new Steps005();
        steps005.precondition();
    }

    @Test(description = "Sort products by title")
    public void sortingTest() {
        steps005.step1();
        steps005.step2();
        steps005.step3();
    }

    @Test(description = "Sort products by price")
    public void priceSortingTest() {
        steps006 = new Steps006();
        steps006.step1();
        steps006.step2();
    }

}
