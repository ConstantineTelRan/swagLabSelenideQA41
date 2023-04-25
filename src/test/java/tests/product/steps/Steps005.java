package tests.product.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import page.CatalogPage;
import tests.CommonSteps;

import java.util.List;

public class Steps005 extends CommonSteps {
    CatalogPage catalogPage;
    List<String> titlesAsc;
    List<String> titlesDesc;

    @Step("Log in to the app")
    public void precondition() {
        getLogin();
    }

    @Step("Open the catalog page. Ensure that products are sorted by titles in ascending order")
    public void step1() {
        catalogPage = new CatalogPage();
        catalogPage.getCatalogTitle().shouldBe(Condition.visible);
        titlesAsc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSorting(titlesAsc, "ASC"));
    }

    public void step2() {
        catalogPage.getSort().selectOption("Name (Z to A)");
        titlesDesc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSorting(titlesDesc, "DESC"));
    }

}
