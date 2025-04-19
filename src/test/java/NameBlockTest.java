import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
/*Автотест для проверки названия блока "Онлайн пополнение без комиссии"
 *на сайте МТС.
 * Проверка названия указанного блока.
 *
 * В "pom.xml" были добавлены параметры в блок <dependencies></dependencies>:
 * webdrivermanager;
 * selenium-java;
 * junit;
 */

public class NameBlockTest {

    private WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        //пишем время задержки
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //вводим адрес страницы, для передачи драйверу
        driver.get("http://mts.by");
    }

    @Test
    public void testNameBlock(){
        String nameBlock = "Онлайн пополнение\nбез комиссии";
        Assertions.assertEquals(nameBlock, driver.findElement(By.xpath("//section[@class='pay']/div/h2[1]")), "название заголовка не совпадает");
    }

    @AfterEach
    public void andTest() {
       driver.quit();
       driver.close();
    }
}
