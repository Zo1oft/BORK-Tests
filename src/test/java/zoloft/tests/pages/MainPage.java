package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            supportButton = $$(".footer-pictured-item").findBy(Condition.text("Служба заботы")),
            kitchenPageButton = $$(".main-tabs__link-button").findBy(Condition.text("Кухня"));

    //actions
    public MainPage openPage() {
        open("https://www.bork.ru/");
        return this;
    }

    public void supportPageTransfer() {
        supportButton.click();

    }

    public void kitchenPageTransfer() {
       kitchenPageButton.click();
    }
}
