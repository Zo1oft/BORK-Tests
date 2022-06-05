package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class G802Page {

    //locator
    SelenideElement
            borkG802Header = $(".slider-text-container__title");

    //action
    public void borkG802Check() {
        borkG802Header.shouldHave(Condition.text("Гриль G802"));
    }
}
