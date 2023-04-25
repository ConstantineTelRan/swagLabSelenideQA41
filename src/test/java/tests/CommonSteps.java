package tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.$x;

public class CommonSteps {

    protected Faker faker = new Faker();
    String login = "standard_user";
    String password = "secret_sauce";
    LoginPage loginPage;

    public void getLogin() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
    }

    public void checkErrorText(String text) {
        $x("//div[@class=\"error-message-container error\"]")
                .shouldBe(Condition.exactText(text));
    }
}
