package src;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Assignment8 {

    public static void main(String[] args) throws IOException {
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

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("c://users/admin/screenshot.png"));
    }
}
