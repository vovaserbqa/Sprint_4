package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhoIsScooterPage {

    WebDriver driver;
    private final By orderButton1 = By.xpath(".//button[@class='Button_Button__ra12g']");
    private final By orderButton2 = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By inputMetro = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By inputMetroType = By.xpath(".//*[contains(text(),'Красносельская')]");
    private final By inputTelephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    public WhoIsScooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public WhoIsScooterPage clickOrderHeaderButton() {
        driver.findElement(orderButton1).click();
        return this;
    }

    public WhoIsScooterPage clickOrderFinishButton() {
        driver.findElement(orderButton2).click();
        return this;
    }

    public void waitMetroVisible(By element) {
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WhoIsScooterPage sendDataWhoIsScooter(String name, String surname, String address, String tel) {
        driver.findElement(inputName).clear();
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputSurname).clear();
        driver.findElement(inputSurname).sendKeys(surname);
        driver.findElement(inputAddress).clear();
        driver.findElement(inputAddress).sendKeys(address);
        driver.findElement(inputMetro).click();
        waitMetroVisible(inputMetroType);
        driver.findElement(inputMetroType).click();
        driver.findElement(inputTelephone).clear();
        driver.findElement(inputTelephone).sendKeys(tel);
        driver.findElement(buttonNext).click();
        return this;
    }
}
