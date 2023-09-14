package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutRentPage {
    WebDriver driver;

    private final By inputWhereBringScooter = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By datepicker = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]"); // понимаю что плохо, но не смог подобрать локатор, простите =)
    private final By rentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By rentalPeriodTime = By.xpath(".//div[text()='сутки']");
    private final By checkboxColorScooter = By.xpath(".//input[@id='black']");
    private final By inputCommentsForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By modalWindowToOrder = By.xpath(".//button[text()='Да']");

    public AboutRentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitDatepicker(By element) {
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(element));
    }


    public void orderIsDisplayed() {
        var isDisplayed = driver.findElement(By.xpath(".//div[text()='Выш заказ оформлен!']")).isDisplayed();
        assertTrue(isDisplayed);
    }


    public AboutRentPage sendDataWhoIsScooter(String comment) {
        driver.findElement(inputWhereBringScooter).click();
        waitDatepicker(datepicker);
        driver.findElement(datepicker).click();
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodTime).click();
        driver.findElement(checkboxColorScooter).click();
        driver.findElement(inputCommentsForCourier).sendKeys(comment);
        driver.findElement(buttonOrder).click();
        driver.findElement(modalWindowToOrder).click();
        return this;
    }
}
