package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OnlinePrePayPageTest {
    private WebDriver driver;
    private OnlinePrePayPage page;

    @BeforeClass
    public void start() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        page = new OnlinePrePayPage(driver);
    }

    @Test
    public void testOnlinePrePayPage() {
        page.start();
        //проверка блока услуги
        Assert.assertEquals(page.getServiceField(), "Услуги связи");
        Assert.assertEquals(page.getMobilePhone(), "Номер телефона");
        Assert.assertEquals(page.getServiceSum(), "Сумма");
        Assert.assertEquals(page.getConnectionMail(), "E-mail для отправки чека");
        //проверка блока домашний интернет
        Assert.assertEquals(page.getHomeInternet(), "Домашний интернет");
        Assert.assertEquals(page.getNumberAbonent(), "Номер абонента");
        Assert.assertEquals(page.getInternetSum(), "Сумма");
        Assert.assertEquals(page.getInternetMail(), "E-mail для отправки чека");
        //проверка блока рассрочка
        Assert.assertEquals(page.getServisePayToPart(), "Рассрочка");
        Assert.assertEquals(page.getNumberScore(), "Номер счета на 44");
        Assert.assertEquals(page.getPayToPartSum(), "Сумма");
        Assert.assertEquals(page.getPayToPartMail(), "E-mail для отправки чека");
        //проверка блока задолженность
        Assert.assertEquals(page.getArrears(), "Задолженность");
        Assert.assertEquals(page.getArrearsNumber(), "Номер счета на 2073");
        Assert.assertEquals(page.getArrearsSum(), "Сумма");
        Assert.assertEquals(page.getArrearsMail(), "E-mail для отправки чека");
    }

    @AfterClass
    public void endTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}

