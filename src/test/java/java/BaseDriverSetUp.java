package java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BaseDriverSetUp {
    protected static WebDriver driver;
    private static final By COOKIE_MESSAGE_PATH = By.xpath("//div[@class='cookie__wrapper']");
    private static final By ACCEPT_COOKIES_BUTTON_PATH = By.xpath("//button[@class='btn btn_black cookie__ok']");

    @BeforeAll
    public static void setUp() {

        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BaseSeleniumPage.setDriver(driver);
        driver.get("https://mts.by");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
