package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.Sorting;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static enums.Sorting.ASC;
import static enums.Sorting.DESC;

@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");
    private SelenideElement catalogTitle = $x("//span[@class=\"title\"]");
    private ElementsCollection cardsTitles = $$x("//div[@class='inventory_item']//div[@class='inventory_item_name']");

    private ElementsCollection cardsPrices = $$x("//div[@class='inventory_item']//div[@class='inventory_item_price']");
    private SelenideElement sort = $x("//select[@data-test=\"product_sort_container\"]");



    public SelenideElement getRandomCard() {
        ElementsCollection cards = $$x("//div[@class='inventory_item']");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }

    public List<String> getTitles() {;
        return cardsTitles.texts();
    }

    public boolean isSortable(List<String> list, Sorting sorting) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy);
        if(sorting == ASC) {
            Collections.sort(copy);
        } else if (sorting == DESC) {
            Collections.reverse(copy);
        }
        return copy.equals(list);
    }

    public List<Double> getPrices() {
        List<String> prices = cardsPrices.texts();
        List<String> pr= prices.stream()
                .map(price -> price.substring(1))
                .collect(Collectors.toList());
        double[] dbl = pr.stream()
                .mapToDouble(value -> Double.parseDouble(value))
                .toArray();
        List<Double> digPrice =DoubleStream.of(dbl).boxed().collect(Collectors.toList());
        return digPrice;
    }







}
