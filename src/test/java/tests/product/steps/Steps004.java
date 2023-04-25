package tests.product.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.Card;
import page.CatalogPage;
import page.LoginPage;
import page.ProductPage;
import tests.CommonSteps;

import javax.xml.catalog.Catalog;

public class Steps004 extends CommonSteps {
    CatalogPage catalogPage;
    Card card;
    ProductPage productPage;

    String cardTitle;
    String cardDesc;
    String cardPrice;

    @Step("Log in to the app")
    public void precondition() {
        getLogin();
    }

    @Step("In the product catalog click on the title of the product")
    public void step1() {
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        card = new Card();
        cardTitle = card.getCardTitle().text();
        card.getCardTitle().click();
    }

    @Step("Compare info on the page with the info on the card")
    public void step2() {
        productPage = new ProductPage();
        productPage.getProductPrice().shouldBe(Condition.visible);
        productPage.getProductTitle().shouldHave(Condition.exactText(cardTitle));
    }

}
