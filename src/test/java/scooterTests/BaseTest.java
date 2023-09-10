package scooterTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @Before
    public void init() {
        driver = WebDriverFactory.get();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void clean() {
        driver.quit();
    }

}