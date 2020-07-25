package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

        WebElement professions = chromeDriver.findElementByXPath
                ("//a[@class='search-page-tabs__item' and @data-tab='professions']");
        WebElement courses = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab=\"courses\"]");
        WebElement webinars = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='webinars']");
        WebElement blogs = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='blogs']");
        WebElement forums = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='forums']");
        WebElement tests = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='tests']");

        WebElement professionsCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='professions']/span");
        WebElement coursesCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab=\"courses\"]/span");
        WebElement webinarsCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='webinars']/span");
        WebElement blogsCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='blogs']/span");
        WebElement forumsCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='forums']/span");
        WebElement testsCount = chromeDriver.findElementByXPath
                (" //a[@class='search-page-tabs__item' and @data-tab='tests']/span");


        wait15seconds.until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        wait15seconds.until(ExpectedConditions.textToBePresentInElement(courses, "Курсы"));
        wait15seconds.until(ExpectedConditions.textToBePresentInElement(webinars, "Вебинары"));
        wait15seconds.until(ExpectedConditions.textToBePresentInElement(blogs, "Блоги"));
        wait15seconds.until(ExpectedConditions.textToBePresentInElement(forums, "Форумы"));
        wait15seconds.until(ExpectedConditions.textToBePresentInElement(tests, "Тесты"));



//        WebElement professions = chromeDriver.findElementByXPath("//div/ul/li[2]/a/span");




        Assertions.assertTrue(Integer.parseInt(professionsCount.getText()) >= 2, "профессий менее 2");
        Assertions.assertTrue(Integer.parseInt(coursesCount.getText()) > 15, "Курсов менее 15");
        Assertions.assertTrue((Integer.parseInt(webinarsCount.getText()) > 180)
                & (Integer.parseInt(webinarsCount.getText()) < 300), "Вебинаров меньше чем 180, но больше 300");
        Assertions.assertTrue(Integer.parseInt(blogsCount.getText()) > 300, "Блогов менее 300");
        Assertions.assertTrue(Integer.parseInt(forumsCount.getText()) != 350, "Форумов 350");
        Assertions.assertTrue(Integer.parseInt(testsCount.getText()) != 0, "Тестов 0");






    }


}
