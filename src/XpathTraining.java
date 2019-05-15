import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class XpathTraining {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com");
        driver.findElement(By.linkText("Interview Guide")).click();

        //following-sibling::
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/following-sibling::li[1]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/following-sibling::li[2]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/following-sibling::li[3]")).click();



        //parent::
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/parent::ul/li[1]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/parent::ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/parent::ul/li[3]")).click();
        driver.findElement(By.xpath("//*[@class='interview-question']/div/div[1]/ul/li[1]/parent::ul/li[4]")).click();



        //by text
        System.out.println("By Text");
        driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
        driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
        driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
        driver.findElement(By.xpath("//*[text()=' Testing ']")).click();



    }

}
