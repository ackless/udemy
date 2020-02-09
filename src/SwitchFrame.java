package src;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwitchFrame {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(topFrame);

        WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(middleFrame);

        String text = driver.findElement(By.id("content")).getText();
        System.out.println(text);

    }
}
