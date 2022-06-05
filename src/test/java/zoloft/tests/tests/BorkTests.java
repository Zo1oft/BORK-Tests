package zoloft.tests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import zoloft.tests.helpers.DriverUtils;
import zoloft.tests.pages.G802Page;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class BorkTests extends TestBase {

    @Test
    @Description("Проверка работы страницы 'Службы заботы'")
    @DisplayName("Служба заботы")
    void supportPageTest() {
        step("Открываем сайт BORK", () -> {
           mainPage.openPage();
        });

        step("Нажимаем на кнопку 'Служба заботы'", () -> {
            mainPage.supportPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            supportPage.supportPageCheck();
        });
    }

    @Test
    @Description("Проверка работы карточки товара 'Гриль G802'")
    @DisplayName("Гриль G802")
    void g802PageTest() {
        step("Открываем сайт BORK", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'Кухня'", () -> {
            mainPage.kitchenPageTransfer();
        });

        step("Переходим на страницу 'Грили'", () -> {
            kitchenPage.grillPageTransfer();
        });

        step("Выбираем Гриль 'G802'", () -> {
            grillPage.borkG802Transfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            g802Page.borkG802Check();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт BORK", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Бытовая техника BORK - официальный сайт. Премиальная техника и аксессуары для дома";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт BORK", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}