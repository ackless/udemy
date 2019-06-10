import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.NoSuchElementException;

public class FluentWaitTest {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                 .withTimeout(Duration.ofSeconds(30))
                 .pollingEvery(Duration.ofSeconds(5))
                 .ignoring(NoSuchElementException.class);

         WebElement elemntWait = wait.until(new Function<WebDriver, WebElement>(){

             public WebElement apply(WebDriver driver){
                 return driver.findElement(By.id("finish"));
             }

         });

    }

}
