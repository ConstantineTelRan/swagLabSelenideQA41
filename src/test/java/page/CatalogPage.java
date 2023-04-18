package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class CatalogPage extends CommonPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");

//    public SelenideElement getCartIcon() {
//        return cartIcon;
//    }
}
