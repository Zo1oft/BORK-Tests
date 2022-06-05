package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class KitchenPage {
    //locator
    SelenideElement
            grillKitchenItem = $$(".category-link").findBy(Condition.text("Грили"));

    //action
    public void grillPageTransfer() {
        grillKitchenItem.click();
    }
}
