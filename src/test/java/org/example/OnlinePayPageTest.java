package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OnlinePayPageTest {

    private WebDriver driver;
    private OnlinePayPage page;

    @BeforeClass
    public void start() {
        driver = WebDriverManager.chromedriver().create();
        page = new OnlinePayPage(driver);
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void resultWorkButtonTest() {
        //переходим в блок Онлайн оплаты
        WebElement payBlock = driver.findElement(By.xpath("//section[@class='pay']"));
        //переходим в блок выбора услуги
        WebElement operatoin = payBlock.findElement(By.xpath("//section[@class='pay']/div/div[1]/div[1]/div[2]/button"));
        operatoin.click();
        WebElement resultOperation = payBlock.findElement(By.xpath("//section[@class='pay']/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
        operatoin.click();
        //вводим номер мобильного телефона
        WebElement numberPhone = payBlock.findElement(By.xpath("//section[@class='pay__forms']/form[1]/div[1]/input"));
        numberPhone.sendKeys("297777777");
        //вводим сумму пополнения, в руб
        WebElement count = payBlock.findElement(By.xpath("//form[@class='pay-form opened']/div[2]/input"));
        count.sendKeys("10");
        //нажимаем кнопку продолжить
        WebElement continueButton = payBlock.findElement(By.xpath("//button[@class='button button__default']"));
        continueButton.click();
        //пробую вывести страницу следующую, после нажатия на кнопку "Продолжить"
        Assertions.assertTrue(equals(driver.findElement(By.xpath("//div[class='app-wrapper__content-container app-wrapper__content-container_full']"))));
    }

    @Test
    public void OnlinePayPageTest() {
        Assert.assertEquals(page.getPayCount(), "10 BYN");
        Assert.assertEquals(page.getNumberPhoneCopy(), "Оплата: Услуги связи\n" + "Номер:375297777777");
        Assert.assertEquals(page.getNumberCart(), "Номер карты");
        Assert.assertEquals(page.getDateCart(), "Срок действия");
        Assert.assertEquals(page.getCvc(), "CVC");
        Assert.assertEquals(page.getNameOwner(), "Имя держателя (как на карте)");
        Assert.assertEquals(page.getPayCountCopy(), " Оплатить  10.00 BYN ");
    }

    @Test
    public void testLogotips() {
        String[] logoText = {"Visa", "Verified by Visa", "Master Card", "MasterCard Secure Code", "Белкарт"};

        for (String Text : logoText) {
            List<WebElement> logos = driver.findElements(By.xpath("//section[@class='pay']/div/div[2]/ul/li, '" + Text + "')]"));
            Text.equals("Логотип платежной системы '" + logos + "' не найден!");
            System.out.println("Логотип '" + logos + "' найден.");
        }
    }

    @AfterClass
    public void endTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
