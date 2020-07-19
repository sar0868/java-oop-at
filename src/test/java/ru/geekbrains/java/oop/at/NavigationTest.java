package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class NavigationTest {

    public ChromeDriver chromeDriver;


    @BeforeEach
    public void beforeEach(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        chromeDriver = new ChromeDriver(options);
    }

    @Test
    public void navigationTest() throws InterruptedException {

        chromeDriver.get("https://geekbrains.ru/events");
        sleep(1000);
        chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/courses\"]").click();
        sleep(1000);
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );
    }

    @AfterEach
    public void afterEach(){
        chromeDriver.quit();
    }


}
