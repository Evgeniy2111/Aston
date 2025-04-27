package org.example;

import org.openqa.selenium.WebDriver;

abstract class WebPage {

    private static WebDriver driver;

    public static void webPage(WebDriver webDriver) {
        driver = webDriver;
    }

}
