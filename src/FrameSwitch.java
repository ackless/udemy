import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FrameSwitch{

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.id("draggable")).click();
        Actions a = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        try {
            Assert.assertEquals("rgb(233, 233, 233) none repeat scroll 50% 0% / auto padding-box border-box", driver.findElement(By.id("droppable")).getCssValue("background"));
        } catch(AssertionError e){
            System.out.println("Element has different color. Exception" + e);
        }

        try {
            a.dragAndDropBy(source, 290, 153).build().perform();
            Assert.assertEquals("rgb(233, 233, 233) none repeat scroll 50% 0% / auto padding-box border-box", driver.findElement(By.id("droppable")).getCssValue("background"));
        } catch(AssertionError e){
            System.out.println("Element has different color. Exception" + e);
        }

        try {
            a.dragAndDropBy(source, -80, -93).build().perform();
            Assert.assertEquals("rgb(255, 250, 144) none repeat scroll 50% 0% / auto padding-box border-box", driver.findElement(By.id("droppable")).getCssValue("background"));
        } catch(AssertionError e){
            System.out.println("Element has different color. Exception" + e);
        }

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href='/resources/demos/droppable/accepted-elements.html']")).click();
    }

}