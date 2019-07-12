import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import org.openqa.selenium.By;
import java.util.Set;


public class WindowHandler {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com");

        driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li[1]")).click();
        Set<String> i = driver.getWindowHandles();
        Iterator<String> w = i.iterator();

        String parent = w.next();
        String child = w.next();

        driver.switchTo().window(parent);
        driver.switchTo().window(child);

    }


}
