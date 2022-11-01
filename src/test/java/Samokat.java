import POM.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;
public class Samokat {
    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
    private final String testText0 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String testText1 = "Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String testText2 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня." +
            " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
            " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String testText3 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String testText4 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String testText5 = "Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String testText6 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String testText7 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    @Before
    public void openBrowserAndScroll() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        Object elementQuestions = driver.findElement(By.xpath("//div[@class='Home_FourPart__1uthg']/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementQuestions);
    }
    @Test
        public void checkHowMuch()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Не верный текст",testText0, mainPage.howMuchClick());
    }
    @Test
    public void checkSeveralScooterClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText1, mainPage.severalScooterClick());
    }
    @Test
    public void checkRentalTimeClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText2, mainPage.rentalTimeClick());
    }
    @Test
    public void checkOrderTodayClick() {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText3, mainPage.orderTodayClick());
    }
    @Test
    public void checkExtendOrderClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText4, mainPage.extendOrderClick());
    }
    @Test
    public void checkBringChargerClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText5, mainPage.bringChargerClick());
    }
    @Test
    public void checkCancelOrderClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText6, mainPage.cancelOrderClick());
    }
    @Test
    public void checkLiveMKADClick()  {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Неверный текст", testText7, mainPage.liveMKADClick());
    }
    @After
    public void closedBrowser() {
        driver.quit();
    }

}
