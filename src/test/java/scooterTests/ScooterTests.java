package scooterTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageobject.AboutRentPage;
import pageobject.ScooterPage;
import pageobject.WhoIsScooterPage;

@RunWith(Parameterized.class)
public class ScooterTests extends BaseTest {
    private final int paramSelect;
    private final int paramContent;
    private final String text;

    public ScooterTests(int paramSelect, int paramContent, String text) {
        this.paramSelect = paramSelect;
        this.paramContent = paramContent;
        this.text = text;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {0, 0, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {1, 1, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {2, 2, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {3, 3, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {4, 4, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {5, 5, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {6, 6, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {7, 7, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }

    @Test
    public void checkImportantQuestionsTest() {
        new ScooterPage(driver)
                .checkImportantQuestionsText(paramSelect, paramContent, text);
    }

    @Test
    public void makeFirstOrderTest() {
        new WhoIsScooterPage(driver)
                .clickOrderHeaderButton()
                .sendDataWhoIsScooter("Иван", "Севальнев", "Москва, Сходненская 54, кв. 43", "+797878685885");
        new AboutRentPage(driver)
                .sendDataWhoIsScooter("Привезите после обеда")
                .orderIsDisplayed();
    }

    @Test
    public void makeSecondOrderTest() {
        new WhoIsScooterPage(driver)
                .clickOrderFinishButton()
                .sendDataWhoIsScooter("Василий", "Свиридов", "Краснодар, Сходненская 54, кв. 42", "+797855585885");
        new AboutRentPage(driver)
                .sendDataWhoIsScooter("Привезите вечером")
                .orderIsDisplayed();
    }
}
