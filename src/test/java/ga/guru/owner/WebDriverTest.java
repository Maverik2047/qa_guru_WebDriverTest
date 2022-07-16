package ga.guru.owner;

import ga.guru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
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

}
