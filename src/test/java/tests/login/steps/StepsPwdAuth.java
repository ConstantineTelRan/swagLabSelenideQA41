package tests.login.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.CatalogPage;
import page.LoginPage;

public class StepsPwdAuth {
    String login = "standard_user";
    String password = "secret_sauce";
    String expectedText = "Accepted usernames are:";
    LoginPage loginPage;
    CatalogPage catalogPage;

    @Step("Log in using valid data")
    public void step1() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
        catalogPage = new CatalogPage();
        catalogPage.getCartIcon().shouldBe(Condition.visible);
    }

}
