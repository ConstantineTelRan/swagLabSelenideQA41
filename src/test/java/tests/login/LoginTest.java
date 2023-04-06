package tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.CatalogPage;
import page.LoginPage;
import tests.TestBase;

public class LoginTest extends TestBase {
    String login = "standard_user";
    String password = "secret_sauce";
    String expectedText = "Accepted usernames are";
    LoginPage loginPage;
    CatalogPage catalogPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
        catalogPage = new CatalogPage();
//        catalogPage.shouldBeVisible();
        Assert.assertTrue(catalogPage.isCartIconExist());
    }

    @Test
    public void checkTest() {
        loginPage = new LoginPage();
        loginPage.checkText(expectedText);
    }
}
