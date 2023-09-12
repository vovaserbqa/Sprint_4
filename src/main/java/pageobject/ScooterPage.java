package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterPage {

    WebDriver driver;

    public ScooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public ScooterPage checkImportantQuestionsText(int paramSelect, int paramContent, String changed) {
        driver.findElement(By.xpath(".//div[@id='accordion__heading-" + paramSelect + "']")).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(".//div[@aria-labelledby='accordion__heading-" + paramContent + "']"), changed));
        return new ScooterPage(driver);
    }
}
