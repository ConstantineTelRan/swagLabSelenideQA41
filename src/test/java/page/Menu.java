package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public abstract class Menu {
    private SelenideElement menuBlock = $x("//div[@class=\"bm-menu\"]");
    private SelenideElement closeMenuButton= $x("//button[@id=\"react-burger-cross-btn\"]");

}
