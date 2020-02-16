package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7 {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
        List<WebElement> columns = table.findElements(By.xpath(".//th"));

        String instructor = rows.get(2).findElement(By.xpath(".//td[1]")).getText();
        String course = rows.get(2).findElement(By.xpath(".//td[2]")).getText();
        String price = rows.get(2).findElement(By.xpath(".//td[3]")).getText();

        System.out.println("Rows number: " + rows.size());
        System.out.println("Columns number: " + columns.size());

        System.out.println("Instructor: " + instructor);
        System.out.println("Course: " + course);
        System.out.println("Price: " + price);

    }

}
