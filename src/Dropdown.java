import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class Dropdown {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.skyscanner.ru/");

        String destinationFrom = "Moscow";
        Thread.sleep(2000);
        String destinationTo = "Amsterdam";
        String flightClass = "First";

        //set destination
        driver.findElement(By.xpath("//input[@id='fsc-origin-search']")).sendKeys(destinationFrom);
        driver.findElement(By.xpath("//input[@id='fsc-destination-search']")).sendKeys(destinationTo);

        //set flight class
        driver.findElement(By.name("class-travellers-trigger")).click();
        Select s = new Select(driver.findElement(By.id("search-controls-cabin-class-dropdown")));
        s.selectByValue(flightClass);
        System.out.println(s.getFirstSelectedOption().getText());

        Assert.assertEquals(s.getFirstSelectedOption().getText(), "Первый класс");

    }

}
