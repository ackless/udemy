import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DropDownParentChild {

    public static void main(String args[]) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");

        //select departure by parent-child relationship xpath
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();

        //select destination by parent-child relationship xpath
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();

        //check that values are set correctly
        Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"), "Delhi (DEL)");
        Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"), "Goa (GOI)");

    }

}
