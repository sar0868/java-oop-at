package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.geekbrains.java.oop.at.base.BaseTest;

import java.util.Arrays;

import static java.lang.Thread.sleep;

//Перейти на сайт https://geekbrains.ru/courses
//Нажать на кнопку Поиск
//В поле Поиск ввести текст: java
//Проверить что на странице:
//Профессий не менее чем 2
//Курсов более 15
//Вебинаров больше чем 180, но меньше 300
//В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//Блогов более 300
//Форумов не 350
//Тестов не 0
//В Проектах и компаниях отображается GeekBrains

public class SearchTest extends BaseTest {

    @Test
    public void searchTest() {
        chromeDriver.findElementByCssSelector
                ("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]").click();
        chromeDriver.findElementByCssSelector("[class=\"search-panel__search-field\"]").sendKeys("java");

        WebElement professions = chromeDriver.
    }


}
