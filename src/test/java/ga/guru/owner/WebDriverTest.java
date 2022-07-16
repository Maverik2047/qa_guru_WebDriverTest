package ga.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = getDriver();
    }

    @Test
    public void testAmazon() {

        String title = driver.getTitle();
        assertEquals("Amazon.com. Spend less. Smile more.", title);

    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
//Конфигурация
    private WebDriver getDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        return driver;
    }
}
