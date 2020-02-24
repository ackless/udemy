package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Autosuggest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://ksrtc.in/");

        WebElement fromAirportField = driver.findElement(By.id("fromPlaceName"));
        fromAirportField.sendKeys("BEN");

        String jsFindValue = "return document.getElementById(\"fromPlaceName\").value;";
        String requiredAirportValue = "BENGALURU INTERNATION AIRPORT";
        String presentAirportValue = (String) js.executeScript(jsFindValue);

        while(!presentAirportValue.equals(requiredAirportValue)) {
            Thread.sleep(1000);
            System.out.println(presentAirportValue);
            fromAirportField.sendKeys(Keys.DOWN);
            presentAirportValue = (String) js.executeScript(jsFindValue);
        }

        Assert.assertEquals(presentAirportValue, requiredAirportValue);

    }

}
