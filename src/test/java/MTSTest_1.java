import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
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
    public void testNameBlock(){
        String nameBlock = "Онлайн пополнение ";
        assertEquals(nameBlock, driver.findElement(By.xpath("//section[@class='pay']/div/h2")), "название заголовка не совпадает");
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
        WebElement numberPhone = payBlock.findElement(By.xpath("//section[@class='pay__forms']/form[1]/div[1]/input"));
        numberPhone.sendKeys("297777777");
        //вводим сумму пополнения, в руб
        WebElement count = payBlock.findElement(By.xpath( "//form[@class='pay-form opened']/div[2]/input"));
        count.sendKeys("1");
        //нажимаем кнопку продолжить
        WebElement continueButton = payBlock.findElement(By.xpath("//button[@class='button button__default']"));
        continueButton.click();

        //пробую вывести страницу следующую, после нажатия на кнопку "Продолжить"
        //boolean resoultContinue = driver.findElement(By.className("app-wrapper__content-container app-wrapper__content-container_full")).
    }

    @AfterAll
    public static void endTest() {
       driver.close();
    }



}


