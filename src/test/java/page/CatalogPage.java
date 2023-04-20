package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");
    private SelenideElement catalogTitle = $x("//span[@class=\"title\"]");

    public SelenideElement getRandomCard() {
        ElementsCollection cards = $$x("//div[@class='inventory_item']");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }

}
