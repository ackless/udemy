import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AlertDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Customer577");
        driver.findElement(By.name("submit")).click();

        Alert firstAlert = driver.switchTo().alert();
        System.out.println(firstAlert.getText());
        firstAlert.accept();
        System.out.println(firstAlert.getText());


    }

}
