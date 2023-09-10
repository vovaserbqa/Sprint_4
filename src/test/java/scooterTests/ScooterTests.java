package scooterTests;

import org.junit.Test;
import pageobject.AboutRentPage;
import pageobject.ScooterPage;
import pageobject.WhoIsScooterPage;

public class ScooterTests extends BaseTest {
    final String TEXT1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    final String TEXT2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    final String TEXT3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    final String TEXT4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    final String TEXT5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    final String TEXT6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    final String TEXT7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    final String TEXT8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void checkImportantQuestionsTest() {
        new ScooterPage(driver)
                .checkImportantQuestionsText1(TEXT1)
                .checkImportantQuestionsText2(TEXT2)
                .checkImportantQuestionsText3(TEXT3)
                .checkImportantQuestionsText4(TEXT4)
                .checkImportantQuestionsText5(TEXT5)
                .checkImportantQuestionsText6(TEXT6)
                .checkImportantQuestionsText7(TEXT7)
                .checkImportantQuestionsText8(TEXT8);
    }


    @Test
    public void makeOrderTest1() {
        new WhoIsScooterPage(driver)
                .clickOrderButton1()
                .sendDataWhoIsScooter("Иван", "Севальнев", "Москва, Сходненская 54, кв. 43", "+797878685885");
        new AboutRentPage(driver)
                .sendDataWhoIsScooter("Привезите после обеда")
                .orderIsDisplayed();


    }

    @Test
    public void makeOrderTest2() {
        new WhoIsScooterPage(driver)
                .clickOrderButton2()
                .sendDataWhoIsScooter("Василий", "Свиридов", "Краснодар, Сходненская 54, кв. 42", "+797855585885");
        new AboutRentPage(driver)
                .sendDataWhoIsScooter("Привезите вечером")
                .orderIsDisplayed();
    }
}
