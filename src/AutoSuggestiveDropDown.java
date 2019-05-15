import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AutoSuggestiveDropDown {

    public static void main(String args[]) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000L);
        WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
        from.click();
        Thread.sleep(1000L);
        WebElement fromList = driver.findElement(By.xpath("//input[contains(@class, 'react-autosuggest__input')]"));
        fromList.sendKeys("SV");
        Thread.sleep(1000L);
        for(int i=0; i<=2; i++) {
            Thread.sleep(1000);
            fromList.sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(1000);
        fromList.sendKeys(Keys.ENTER);


    }

}
