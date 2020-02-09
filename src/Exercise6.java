package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;

public class Exercise6{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        int selectRandomCheckbox = new Random().nextInt(driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label")).size());
        System.out.println(selectRandomCheckbox);

        WebElement selectedCheckbox = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[" + (selectRandomCheckbox + 1) + "]"));
        selectedCheckbox.findElement(By.xpath("//input[@type='checkbox']")).click();

        Select dropDownList = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropDownList.selectByVisibleText(selectedCheckbox.getText().trim());


    }



}