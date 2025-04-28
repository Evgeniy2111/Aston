package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

abstract class WebPage {

    private static WebDriver driver ;

    public void webPage(WebDriver driver) {
        this.driver = WebDriverManager.chromedriver().create();
    }

}
