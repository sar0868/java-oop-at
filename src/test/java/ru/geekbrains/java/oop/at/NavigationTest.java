package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseTest;

public class NavigationTest extends BaseTest {


        @Test
        public void courses() {
        chromeDriver.findElementByCssSelector("[id=\"nav\"] [href=\"/courses\"]").click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );
    }

}
