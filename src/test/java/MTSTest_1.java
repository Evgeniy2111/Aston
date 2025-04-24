import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*Автотест для проверки названия блока "Онлайн пополнение без комиссии"
 *на сайте МТС.
 * Проверка названия указанного блока.
 *
 * В "pom.xml" были добавлены параметры в блок <dependencies></dependencies>:
 * webdrivermanager;
 * selenium-java;
 * junit;
 */

public class MTSTest_1 {

    private static WebDriver driver;

    @BeforeAll
    static void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://mts.by");
        //данный параметр создавал исключительно для себя, Тк ноутбук медленно прогружал
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void testNameBlock() {
        String nameBlock = "Онлайн пополнение ";
        // assertEquals(nameBlock, driver.findElement(By.xpath("//section[@class='pay']/div/h2[1]")), "название заголовка не совпадает");
        Assertions.assertEquals(nameBlock, driver.findElement(By.xpath("//section[@class='pay']/div/h2[1]")).getText(), "название заголовка не совпадает");
    }


    @Test
    public void testLogotips() {
        Assertions.assertTrue(driver.findElement(By.xpath("//img[contains(@src, 'visa-verified')]")).isDisplayed(), "Логотип 'Visa' не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[contains(@src, 'pay/mastercard.svg')]")).isDisplayed(), "Логотип 'MasterCard' не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[contains(@src, 'visa-verified')]")).isDisplayed(), "Логотип 'Verified By Visa' не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[contains(@src, 'mastercard-secure')]")).isDisplayed(), "Логотип 'MasterCard Secure Code' не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class='pay__partners']/ul/li[4]/img")).isDisplayed(), "Логотип 'Белкарт' не отображается");
    }

    @Test
    public void resultWorkURL() {
        String linkUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        //проверяю открытие кнопки "Подробнее о сервисе)
        Response response = RestAssured.get(linkUrl);
        assertEquals(200, response.getStatusCode());
        System.out.println("Ссылка 'Подробнее о сервисе' работает");

        //второй вариант
        /*
         * */
    }

    @Test
    public void resultWorkButton() {
        //переходим в блок Онлайн оплаты
        WebElement payBlock = driver.findElement(By.xpath("//section[@class='pay']"));
        //переходим в блок выбора услуги
        WebElement operatoin = payBlock.findElement(By.xpath("//section[@class='pay']/div/div[1]/div[1]/div[2]/button"));
        operatoin.click();
        WebElement resultOperation = payBlock.findElement(By.xpath("//section[@class='pay']/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
        operatoin.click();
        //вводим номер мобильного телефона
        WebElement numberPhone = payBlock.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        operatoin.click();
        numberPhone.sendKeys("297777777");
        //вводим сумму пополнения, в руб
        WebElement count = payBlock.findElement(By.xpath("//form[@class='pay-form opened']/div[2]/input"));
        operatoin.click();
        count.sendKeys("1");
        //нажимаем кнопку продолжить
        WebElement continueButton = payBlock.findElement(By.xpath("//form[@class='pay-form opened']/button[@class='button button__default ']"));
        continueButton.click();
        //пробую вывести страницу следующую, после нажатия на кнопку "Продолжить"
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class='bepaid-app']")).isDisplayed());
    }

    @AfterAll
    public static void endTest() {
        driver.close();
    }


}


