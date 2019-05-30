import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class tele2 {
    public static void main(String args[]) throws InterruptedException {
        boolean present;
        present = true;

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://msk.tele2.ru/bolshe/events");
        Thread.sleep(10000);

        while(present) {
            driver.findElement(By.xpath("//div[@class='loyalty-event__conditions__btns hidden-xs']/div[1]")).click();

            try {
                driver.findElement(By.className("loyalty-event__error-message"));
            } catch (NoSuchElementException e) {
                present = false;
            }
            System.out.println(present);
            driver.navigate().refresh();
        }
    }

}
