package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class ConfingTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("http://mts.by");
        WebElement payBlock = driver.findElement(By.xpath("//section[@class='pay']"));
        payBlock.click();

    }

    @AfterClass
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
