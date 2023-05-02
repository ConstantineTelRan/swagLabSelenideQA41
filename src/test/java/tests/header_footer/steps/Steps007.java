package tests.header_footer.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import page.CatalogPage;
import tests.CommonSteps;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.*;

public class Steps007 extends CommonSteps {
    CatalogPage catalogPage;
    String twitterLink = "https://twitter.com/saucelabs";
    String facebookLink = "https://www.facebook.com/saucelabs";
    String linkedInLink = "https://www.linkedin.com/company/sauce-labs/";
    String linkedInLinkAuth = "https://www.linkedin.com/authwall";

    @Step("Open the catalog page")
    public void step1() {
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
    }

    @Step("Check the Twitter link in the footer")
    public void step2() {
        catalogPage.getSocialLinks().findBy(Condition.exactText("Twitter"))
                .shouldHave(Condition.href(twitterLink)).click();
        switchTo().window(1);
        webdriver().shouldHave(url(twitterLink));
        Selenide.closeWindow();
        switchTo().window(0);
    }

    @Step("Check the Facebook link in the footer")
    public void step3() {
        catalogPage.getSocialLinks().findBy(Condition.exactText("Facebook"))
                .shouldHave(Condition.href(facebookLink)).click();
        switchTo().window(1);
        webdriver().shouldHave(url(facebookLink));
        Selenide.closeWindow();
        switchTo().window(0);
    }

    @Step("Check the Linkedin link in the footer")
    public void step4() {
        catalogPage.getSocialLinks().findBy(Condition.exactText("LinkedIn"))
                .shouldHave(Condition.href(linkedInLink)).click();
        switchTo().window(1);
        webdriver().shouldHave(urlContaining(linkedInLinkAuth));
    }

}
