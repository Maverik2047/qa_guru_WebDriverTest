package ga.guru.owner;


import ga.guru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testAmazon() {

        String title = driver.getTitle();
        WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
        searchbar.sendKeys("DragonAge");
        searchbar.submit();
        Assertions.assertEquals("Amazon.com. Spend less. Smile more.", title);


    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

}
