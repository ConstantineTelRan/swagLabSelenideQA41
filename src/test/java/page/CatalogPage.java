package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static enums.Sorting.ASC;
import static enums.Sorting.DESC;

import enums.Sorting;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");
    private SelenideElement catalogTitle = $x("//span[@class=\"title\"]");

    private ElementsCollection cardsTitles = $$x("//div[@class='inventory_item']//div[@class=\"inventory_item_name\"]");
    private ElementsCollection cardPrices = $$x("//div[@class='inventory_item']//div[@class='inventory_item_price']");
    private SelenideElement sort = $x("//select[@class=\"product_sort_container\"]");

    public SelenideElement getRandomCard() {
        ElementsCollection cards = $$x("//div[@class='inventory_item']");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }

    public List<String> getTitles() {
        return cardsTitles.texts();
    }

    public boolean isTitlesSorting(Sorting sorting) {
        List<String> list = getTitles();
        List<String> copy = new ArrayList<>(list);
        if(sorting == ASC) {
            Collections.sort(copy);
        } else if (sorting == DESC) {
            Collections.sort(copy);
            Collections.reverse(copy);
        }
        return copy.equals(list);
    }

    public List<Double> getPrices() {
        List<String> prices = cardPrices.texts();
        List<String> pr = prices
                .stream()
                .map(price -> price.substring(1))
                .collect(Collectors.toList());
        double[] dbl = pr
                .stream()
                .mapToDouble(value -> Double.parseDouble(value))
                .toArray();
        List<Double> digPrices = DoubleStream.of(dbl).boxed().collect(Collectors.toList());
        return digPrices;
    }

    public boolean isPricesSorting(Sorting sorting) {
        List<Double> list = getPrices();
        List<Double> copy = new ArrayList<>(list);
        if(sorting == ASC) {
            Collections.sort(copy);
        } else if (sorting == DESC) {
            Collections.sort(copy);
            Collections.reverse(copy);
        }
        return copy.equals(list);
    }





}
