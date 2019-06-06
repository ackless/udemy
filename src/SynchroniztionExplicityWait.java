import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchroniztionExplicityWait {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.xpath("//a[contains(text(), 'Click to load get data via Ajax!')]")).click();

        WebDriverWait waitDriver = new WebDriverWait(driver, 50);
        waitDriver.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='results']"), "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page."));

        System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
    }

}
