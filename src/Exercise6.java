package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class Exercise6{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","e:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //select random checkbox among present
        int selectRandomCheckbox = new Random().nextInt((driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label")).size())-1);

        //Click on checkbox and get its name
        WebElement selectedCheckbox = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[" + (selectRandomCheckbox + 1) + "]"));
        selectedCheckbox.findElement(By.xpath(".//input[@type='checkbox']")).click();
        String checkboxLabel = selectedCheckbox.getText();

        //select option at dropbox as the checkbox's name + get name of selected value
        Select dropDownList = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropDownList.selectByVisibleText(selectedCheckbox.getText().trim());
        String dropDownLabelText = dropDownList.getFirstSelectedOption().getText();

        //Put value into field
        WebElement alertField = driver.findElement(By.className("pull-right"));
        alertField.findElement(By.xpath(".//input[@id='name']")).sendKeys(dropDownLabelText);
        alertField.findElement(By.xpath(".//input[@id='alertbtn']")).click();

        //call alert
        Alert shownAlert = driver.switchTo().alert();
        String alertText = shownAlert.getText();

        //Check actual and expected result
        Assert.assertTrue(alertText.contains(checkboxLabel));
    }
}