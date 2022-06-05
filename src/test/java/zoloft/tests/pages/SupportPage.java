package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SupportPage {
    //locators
    SelenideElement
    supportContent = $("#page-content");


    //actions
    public void supportPageCheck() {
        supportContent.shouldHave(Condition.text("Сервис"));
    }
}
