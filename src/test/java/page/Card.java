package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class Card extends CatalogPage {
    private SelenideElement cardTitle = getRandomCard().find("div[class=\"inventory_item_name\"]");
    private SelenideElement cardDesc = getRandomCard().find("div[class = 'inventory_item_desc']");


}
