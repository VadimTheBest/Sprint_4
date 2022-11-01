import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.cssSelector;
import POM.Form;

import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class Order {

    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();

    final By buttonAddress;
    final String name;
    final String family;
    final String address;
    final String numberPhone;
    final String comment;

    public Order(By buttonAddress, String name, String family, String address, String numberPhone, String comment) {
        this.buttonAddress = buttonAddress;
        this.name = name;
        this.family = family;
        this.address = address;
        this.numberPhone = numberPhone;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] Parameters() {
        return new Object[][] {
                {cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g"), "Путин", "Владимир", "Кремлевская набережная, д.1", "88888888888", "Если драка неизбежна, бить нужно первым!"},
                {cssSelector("div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"), "Дмитрий", "Медведев", "ул. Тверская, д.1", "99999999999", "Вы держитесь здесь, вам все доброго, хорошего настроения и здоровья!"},
        };
    }
    @Test
    public void checkOrderFromHeader_success() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Form FormPage = new Form(driver);
        FormPage.startPage();
        FormPage.findCheckAndClickOrderButton(buttonAddress);
        FormPage.userName(name);
        FormPage.userSurname(family);
        FormPage.userAddress(address);
        FormPage.userPhone(numberPhone);
        FormPage.metroStation();
        FormPage.metroStationChoice();
        FormPage.nextPageButton();
        FormPage.calendarDate();
        FormPage.rentalDuration();
        FormPage.scooterColour();
        FormPage.userComment(comment);
        FormPage.orderButton();
        FormPage.confirmButton();
        assertTrue("ERROR", FormPage.CreatedOrder());
    }

    @After
    public void closedBrowser() {
        driver.quit();
    }
}