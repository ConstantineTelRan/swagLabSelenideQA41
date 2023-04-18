package tests.login.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.CatalogPage;
import page.LoginPage;
import tests.CommonSteps;

public class StepsWrongLoginAuth extends CommonSteps {
    String login = faker.name().username();
    String password = "secret_sauce";
    String expectedText = "Accepted usernames are:";
    String errorText = "Epic sadface: Username and password do not match any user in this service jdjdjd";
    LoginPage loginPage;



    @Step("Log in using not valid login")
    public void step1() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
    }

    @Step("Ensure that the error message is displayed under the input fields")
    public void step2() {
        checkNotificationText(errorText);
    }





}
