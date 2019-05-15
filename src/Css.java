import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Css {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Login");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id='Login']")).click();


    }

}
