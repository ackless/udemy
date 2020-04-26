package src;

import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class InstallOffice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //import package
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://poamn-8e44f27950ea.aqa.int.zone:8080/servlet/Turbine/frm/single/?event1234submit=doLogin&action=PLoginHandler&user=admin&password=1q2w3e");
        Thread.sleep(2000);
        driver.switchTo().frame("leftFrame").findElement(By.xpath("//b[text()='Applications']")).click();
        driver.switchTo().parentFrame().switchTo().frame("mainFrame");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='O365_APS2']")).click();

        //install instance

        driver.findElement(By.id("aps_packages_manage")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("nextAction")).click();
        Thread.sleep(2000);
        //driver.switchTo().parentFrame().switchTo().frame("mainFrame");
        driver.switchTo().frame("aps2-ui");
        Thread.sleep(2000);

        for(int i=0;i<=1000;i++) {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniqName_2_1")));
            driver.findElement(By.id("uniqName_2_1")).click();
            driver.findElement(By.xpath("//input[@id, 'profileName']")).sendKeys("Profile Name #" + i);
            driver.findElement(By.xpath("//input[@id, 'nameid']")).sendKeys("Name " + i);
            driver.findElement(By.xpath("//input[@id, 'skuid']")).sendKeys("uiwfeh9832hiowu" + i);
            driver.findElement(By.id("submitAction")).click();

        }


    }

}
