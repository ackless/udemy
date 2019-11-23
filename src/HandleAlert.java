package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;


public class HandleAlert {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dear User");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());
        String alertMessage = driver.switchTo().alert().getText();
        try{
            Assert.assertEquals(alertMessage,"Hello Dear User, share this practice page and share your knowledge");
            System.out.println("Test Passed!");
        } catch(AssertionError e){
            System.out.println("Error: " + e);
        }

        driver.switchTo().alert().accept();

    }



}
