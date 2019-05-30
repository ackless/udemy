import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class ClearTripTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Login to Website
        driver.get("https://www.cleartrip.com/");

        //Define elements
        Select adults = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
        Select children = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));

        //Select values from dropdown list
        adults.selectByValue("2");
        children.selectByValue("1");

        //Open calendar and select current date
        driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
        WebElement calendar = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
        calendar.findElement(By.cssSelector("td[class*='selected']")).click();

        //Open "More options" and enter preferred airline
        driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
        driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("Indigo");

        //Click on "Search flights"
        driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

        //Print out error to console
        System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
    }
}
