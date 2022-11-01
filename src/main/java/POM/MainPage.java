package POM;
import static org.openqa.selenium.By.id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
public class MainPage  {
    private WebDriver driver;
    public  MainPage(WebDriver driver) {this.driver = driver;}
    private final  By howMuch = id("accordion__panel-0"); //Сколько это стоит? И как оплатить?
    private final By severalScooter = id("accordion__panel-1"); //Хочу сразу несколько самокатов! Так можно?
    private final By rentalTime = id("accordion__panel-2"); //Как рассчитывается время аренды?
    private final By orderToday = id("accordion__panel-3"); //Можно ли заказать самокат прямо на сегодня?
    private final By extendOrder = id("accordion__panel-4"); //Можно ли продлить заказ или вернуть самокат раньше?
    private final By bringCharger = id("accordion__panel-5"); //Вы привозите зарядку вместе с самокатом?
    private final By cancelOrder = id("accordion__panel-6"); //Можно ли отменить заказ?
    private final By liveMKAD = id("accordion__panel-7"); //Я жизу за МКАДом, привезёте?

    private final By howMucButton = id("accordion__heading-0");//CLICK Сколько это стоит? И как оплатить?
    private final By severalScooterButton = id("accordion__heading-1");//CLICK Хочу сразу несколько самокатов! Так можно
    private final By rentalTimeButton = id("accordion__heading-2");//CLICK Как рассчитывается время аренды?
    private final By orderTodayButton = id("accordion__heading-3");//CLICK Можно ли заказать самокат прямо на сегодня?
    private final By extendOrderButton = id("accordion__heading-4");//CLICK Можно ли продлить заказ или вернуть самокат раньше?
    private final By bringChargerButton = id("accordion__heading-5");//CLICK Вы привозите зарядку вместе с самокатом?
    private final By cancelOrderButton = id("accordion__heading-6");//CLICK Можно ли отменить заказ?
    private final By liveMKADButton = id("accordion__heading-7");//CLICK Я живу за МКАДом, привезёте?

    public String  howMuchClick() { // Получить текст с "Сколько это стоит? И как оплатить?"
        driver.findElement(howMucButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(howMuch).getText();
        return text;
    }
    public String severalScooterClick() {  //Получить текст с "Хочу сразу несколько самокатов! Так можно?"
        driver.findElement(severalScooterButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(severalScooter).getText();
        return text;
    }
    public String rentalTimeClick(){  //Получить текст с "Как рассчитывается время аренды?"
        driver.findElement(rentalTimeButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(rentalTime).getText();
        return text;
    }
    public String orderTodayClick(){  //Получить текст с "Можно ли заказать самокат прямо на сегодня?"
        driver.findElement(orderTodayButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(orderToday).getText();
        return text;
    }
    public String extendOrderClick() {  //Получить текст с "Можно ли продлить заказ или вернуть самокат раньше?"
        driver.findElement(extendOrderButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(extendOrder).getText();
        return text;
    }
    public String bringChargerClick() {  //Получить текст с "Вы привозите зарядку вместе с самокатом?"
        driver.findElement(bringChargerButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(bringCharger).getText();
        return text;
    }
    public String cancelOrderClick(){  //Получить текст с "Можно ли отменить заказ?"
        driver.findElement(cancelOrderButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(cancelOrder).getText();
        return text;
    }
    public String liveMKADClick() {  //Получить текст с "Я живу за МКАДом, привезёте?"
        driver.findElement(liveMKADButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String text = driver.findElement(liveMKAD).getText();
        return text;
    }


}


