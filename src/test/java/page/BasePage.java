package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public abstract class BasePage extends Menu {
    private ElementsCollection socialLinks = $$x("//ul[@class='social']//a");
    private SelenideElement burgerButton = $x("//button[@id=\"react-burger-menu-btn\"]");

}
