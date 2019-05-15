import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class facebook {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        /*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("my own xpath");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
        driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(("pass"));
        driver.findElement(By.cssSelector("[value='Log In']")).click();

    }

}
