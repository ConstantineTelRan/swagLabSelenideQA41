package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");

    public SelenideElement getRandomCard() {
        ElementsCollection cards = $$x("//div[@class='inventory_item']");
        Random random = new Random();
        int randomIndex = random.nextInt(cards.size());
        return cards.get(randomIndex);
    }




}
