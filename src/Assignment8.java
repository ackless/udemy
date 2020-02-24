package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Assignment8 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement searchBox = driver.findElement(By.id("autocomplete"));
        searchBox.sendKeys("Aus");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String fieldValue = (String) js.executeScript(script);

        while(!fieldValue.equalsIgnoreCase("Austria")){
            searchBox.sendKeys(Keys.DOWN);
            fieldValue = (String) js.executeScript(script);
        }
    }
}
