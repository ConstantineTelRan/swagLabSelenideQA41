package tests;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$x;

public class CommonSteps {
    protected Faker faker = new Faker();

    public void checkNotificationText(String text) {
        $x("//div[@class=\"error-message-container error\"]").shouldBe(Condition.exactText(text));
    }
}
