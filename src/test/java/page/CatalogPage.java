package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import java.util.*;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
@Getter
public class CatalogPage {
    private SelenideElement cartIcon = $x("//a[@class='shopping_cart_link']");
    private SelenideElement catalogTitle = $x("//span[@class=\"title\"]");

    private ElementsCollection cardsTitles = $$x("//div[@class='inventory_item']//div[@class=\"inventory_item_name\"]");
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

    public boolean isSorting(List<String> list, String sort) {
        List<String> copy = new ArrayList<>(list);
        if(sort == "ASC") {
            Collections.sort(copy);
        } else if (sort == "DESC") {
            Collections.sort(copy);
            Collections.reverse(copy);
        }
        return copy.equals(list);
    }

    /*
    * список с текстом заголовков, которые мы получили с помощью метода getTitles, после применения фильтра (titles)
    * делаем копию списка titles (copy)
    * сортируем список copy
    * проверяем, что списки titles и copy одинаковые
    *
    * a = [3, 2, 1]
    * b = [3, 2, 1].sort
    * b = [1, 2, 3]
    * if a == b
    * isSorting(titles, "ASC")
    * */







}
