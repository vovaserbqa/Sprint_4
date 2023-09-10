package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterPage {

    WebDriver driver;
    private final By importantQuestionsElement1 = By.xpath(".//div[@id='accordion__heading-0']");
    private final By importantQuestionsElement2 = By.xpath(".//div[@id='accordion__heading-1']");
    private final By importantQuestionsElement3 = By.xpath(".//div[@id='accordion__heading-2']");
    private final By importantQuestionsElement4 = By.xpath(".//div[@id='accordion__heading-3']");
    private final By importantQuestionsElement5 = By.xpath(".//div[@id='accordion__heading-4']");
    private final By importantQuestionsElement6 = By.xpath(".//div[@id='accordion__heading-5']");
    private final By importantQuestionsElement7 = By.xpath(".//div[@id='accordion__heading-6']");
    private final By importantQuestionsElement8 = By.xpath(".//div[@id='accordion__heading-7']");
    private final By importantQuestionsElementIn1 = By.xpath(".//div[@aria-labelledby='accordion__heading-0']");
    private final By importantQuestionsElementIn2 = By.xpath(".//div[@aria-labelledby='accordion__heading-1']");
    private final By importantQuestionsElementIn3 = By.xpath(".//div[@aria-labelledby='accordion__heading-2']");
    private final By importantQuestionsElementIn4 = By.xpath(".//div[@aria-labelledby='accordion__heading-3']");
    private final By importantQuestionsElementIn5 = By.xpath(".//div[@aria-labelledby='accordion__heading-4']");
    private final By importantQuestionsElementIn6 = By.xpath(".//div[@aria-labelledby='accordion__heading-5']");
    private final By importantQuestionsElementIn7 = By.xpath(".//div[@aria-labelledby='accordion__heading-6']");
    private final By importantQuestionsElementIn8 = By.xpath(".//div[@aria-labelledby='accordion__heading-7']");


    public ScooterPage(WebDriver driver) {
        this.driver = driver;
    }


    public ScooterPage checkImportantQuestionsText1(String changed) {
        driver.findElement(importantQuestionsElement1).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn1, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText2(String changed) {
        driver.findElement(importantQuestionsElement2).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn2, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText3(String changed) {
        driver.findElement(importantQuestionsElement3).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn3, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText4(String changed) {
        driver.findElement(importantQuestionsElement4).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn4, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText5(String changed) {
        driver.findElement(importantQuestionsElement5).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn5, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText6(String changed) {
        driver.findElement(importantQuestionsElement6).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn6, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText7(String changed) {
        driver.findElement(importantQuestionsElement7).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn7, changed));
        return new ScooterPage(driver);
    }

    public ScooterPage checkImportantQuestionsText8(String changed) {
        driver.findElement(importantQuestionsElement8).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.textToBePresentInElementLocated(importantQuestionsElementIn8, changed));
        return new ScooterPage(driver);
    }

}
