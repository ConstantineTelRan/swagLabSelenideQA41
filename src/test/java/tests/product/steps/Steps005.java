package tests.product.steps;

import com.google.common.collect.Ordering;
import enums.Sorting;
import org.testng.Assert;
import page.CatalogPage;
import tests.CommonSteps;

import java.util.List;

import static enums.SortingValue.*;

public class Steps005 extends CommonSteps {
    CatalogPage catalogPage;
    List<String> titlesAsc;
    List<String> titlesDesc;
    List<Double> pricesAsc;
    List<Double> pricesDesc;


    public void precondition() {
        getLogin();
    }

    public void step1() {
        catalogPage = new CatalogPage();
        titlesAsc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSortable(titlesAsc, Sorting.ASC));
    }

    public void step2() {
        catalogPage.getSort().selectOption(NAME_DESC.getValue());
        titlesDesc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSortable(titlesDesc, Sorting.DESC));
    }

    public void step3() {
        catalogPage.getSort().selectOption(NAME_ASC.getValue());
        titlesAsc = catalogPage.getTitles();
        Assert.assertTrue(catalogPage.isSortable(titlesAsc, Sorting.ASC));
    }


    public void step4() {
        catalogPage.getSort().selectOption(PRICE_DESC.getValue());
        pricesDesc = catalogPage.getPrices();
        boolean sorted = Ordering.natural().reverse().isOrdered(pricesDesc);
        Assert.assertTrue(catalogPage.isPriceSortable(pricesDesc, Sorting.DESC));
    }




}
