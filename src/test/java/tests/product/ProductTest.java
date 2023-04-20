package tests.product;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;
import tests.product.steps.Steps004;

public class ProductTest extends TestBase {
    Steps004 steps004;

    @BeforeMethod
    public void precondition() {
        steps004 = new Steps004();
        steps004.precondition();
    }

    @Test
    public void productTest() {
        steps004.step1();
        steps004.step2();
    }
}