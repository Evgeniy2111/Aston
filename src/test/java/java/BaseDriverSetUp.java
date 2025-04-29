package java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseDriverSetUp {
    protected static WebDriver driver;


    @BeforeAll
    public static void setUp() {

        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get("https://mts.by");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
