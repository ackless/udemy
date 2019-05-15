import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class InstallOffice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //import package
        driver.get("http://poamn-5c46e765a9e3.aqa.int.zone:8080/servlet/Turbine/frm/single/?event1234submit=doLogin&action=PLoginHandler&user=admin&password=1q2w3e");
        driver.switchTo().frame("leftFrame").findElement(By.xpath("//b[text()='Applications']")).click();
        driver.switchTo().parentFrame().switchTo().frame("mainFrame").findElement(By.xpath("//span[text()='Import Package']")).click();
        driver.findElement(By.id("inp_url_path")).sendKeys("https://repo.int.zone/artifactory/aps-connectors/O365_APS2/O365_APS2-last.app.zip");
        driver.switchTo().parentFrame().switchTo().frame("mainFrame").findElement(By.xpath("//span[text()='Submit']")).click();
        driver.findElement(By.xpath("//a[text()='O365_APS2']")).click();

        //install instance
        driver.switchTo().parentFrame().switchTo().frame("mainFrame");
        driver.findElement(By.xpath("//span[text()='Add Instance']")).click();
        driver.findElement(By.cssSelector("id#check_accept_impersonation_level_id")).click();
        driver.findElement(By.cssSelector("type#submit"));




    }

}
