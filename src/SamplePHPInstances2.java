package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


public class SamplePHPInstances2 {

    public static void main(String[] args) throws InterruptedException {
        IntStream.range(0,200).parallel().forEach(i->{
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //import package
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.get("http://poamn-0d9eebc350d3.aqa.int.zone:8080/servlet/Turbine/frm/single/?event1234submit=doLogin&action=PLoginHandler&user=admin&password=1q2w3e");
            //Thread.sleep(4000);
            driver.switchTo().frame("leftFrame").findElement(By.xpath("//b[text()='Applications']")).click();
            driver.switchTo().parentFrame().switchTo().frame("mainFrame");
           // Thread.sleep(4000);
            driver.findElement(By.xpath("//a[text()='sample-php-application']")).click();


            driver.findElement(By.id("aps_own_applications_manage")).click();
           // Thread.sleep(4000);
            driver.findElement(By.id("check_accept_impersonation_level_id")).click();
            driver.findElement(By.id("aps_own_applications_manage")).click();
          //  Thread.sleep(4000);
            driver.findElement(By.id("aps_own_applications_manage")).click();
         //   Thread.sleep(4000);
            driver.findElement(By.id("aps_own_applications_manage1Button")).click();

            driver.quit();


/*
            //install instance

            driver.findElement(By.id("aps_packages_manage")).click();
            Thread.sleep(4000);

            driver.switchTo().frame("aps2-ui");
            driver.findElement(By.id("id_smart_defaultsInput")).click();

            driver.switchTo().parentFrame();
            driver.findElement(By.id("nextAction")).click();
            Thread.sleep(4000);
            driver.findElement(By.id("submitAction")).click();
            Thread.sleep(4000);
*/
        });
    }
}
