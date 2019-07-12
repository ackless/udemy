import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FrameSwitch{

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        //driver.switchTo().frame
        driver.findElement(By.id("draggable")).click();


    }




}