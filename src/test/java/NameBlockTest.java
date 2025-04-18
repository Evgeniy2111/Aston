import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
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
    }

    @Test
    public void testNameBlock() throws InterruptedException {
        //вводим адрес страницы, для передачи драйверу
        driver.get("https://www.mts.by/");
        //пишем время задержки
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //ищем блок с названием "Онлайн пополнение без комиссий", через xpath
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[3]/div[1]/div/div/div[2]/section/div/h2/text()[1]"));
    }

    @AfterEach
    public void andTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
