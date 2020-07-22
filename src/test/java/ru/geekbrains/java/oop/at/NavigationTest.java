package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.java.oop.at.base.BaseTest;


//Вынести проверку каждой страницы в отдельный тест
// Реализовать проверку отображения блоков Header и Footer
// на каждой странице сайта (как минимум самого блока)
//(Дополнительное задание, тема следующего занятия)
// Cоздать классы Header и Footer в которых создать
// локаторы ко всем элементам в этих блоках

public class NavigationTest extends BaseTest {

        @AfterEach
        void checkFooterHeader(){
                WebElement header = chromeDriver.findElementByCssSelector("[class*=\"gb-header__content\"]");
                WebElement footer = chromeDriver.findElementByCssSelector("[class=\"site-footer\"]");
                wait15seconds.until(ExpectedConditions.visibilityOf(header));
//               проверяем наличие элемента header, и ожидаем если потребуется 15 секунд
                wait15seconds.until(ExpectedConditions.visibilityOf(footer));
        }

        @Test
        public void courses() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/courses\"]").click();
                Assertions.assertEquals(
                        "Курсы",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }

        @Test
        public void events() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/events\"]").click();
                Assertions.assertEquals(
                        "Вебинары",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }

        @Test
        public void topics() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/topics\"]").click();
                Assertions.assertEquals(
                        "Форум",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }

        @Test
        public void posts() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/posts\"]").click();
                chromeDriver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click();
                chromeDriver.findElementByCssSelector("button [class=\"svg-icon icon-popup-close-button \"]").click();

                Assertions.assertEquals(
                        "Блог",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }



        @Test
        public void tests() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/tests\"]").click();
                Assertions.assertEquals(
                        "Тесты",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }

        @Test
        public void career() {
                chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/career\"]").click();
                Assertions.assertEquals(
                        "Карьера",
                        chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
                );
        }
}
