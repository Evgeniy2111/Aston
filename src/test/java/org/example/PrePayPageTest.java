package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.ConfingTest;
import org.example.PrePayPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PrePayPageTest  extends ConfingTest {

    @Test
    public void booleanStringTest() {
        PrePayPage prePayPage = new PrePayPage();
        prePayPage.booleanString();
    }

    @Test
    public void inputDataUserTest() {
        PrePayPage prePayPage = new PrePayPage();
        prePayPage.inputDataUser("297777777", "10");
    }
}
