package tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.$x;

public class CommonSteps {
    String login = "standard_user";
    String password = "secret_sauce";
    LoginPage loginPage;
    protected Faker faker = new Faker();

    public void checkErrorText(String text) {
        $x("//div[@class=\"error-message-container error\"]")
                .shouldBe(Condition.exactText(text));
    }

    public void getLogin() {
        loginPage = new LoginPage();
        loginPage.login(login, password);
    }
}
