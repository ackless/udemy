import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;


public class CheckboxesExercise {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

    }
}
