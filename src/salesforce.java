import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class salesforce {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("login");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();

    }

}
