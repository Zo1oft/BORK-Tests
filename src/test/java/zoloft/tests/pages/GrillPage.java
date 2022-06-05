package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class GrillPage {

    //locator
    SelenideElement
            borkG802 = $$(".product-white").findBy(Condition.text("Гриль BORK G802"));

    //action
    public void borkG802Transfer() {
        borkG802.click();
    }
}
