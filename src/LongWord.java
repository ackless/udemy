import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LongWord {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.govorimpro.us/%D0%B8%D0%B3%D1%80%D1%8B-%D0%B8-%D1%82%D0%B5%D1%81%D1%82%D1%8B/51339-%D0%B8%D0%B3%D1%80%D0%B0-%D0%B1%D0%B5%D1%81%D0%BA%D0%BE%D0%BD%D0%B5%D1%87%D0%BD%D0%BE%D0%B5-%D1%81%D0%BB%D0%BE%D0%B2%D0%BE-3.html");
        WebDriverWait driverx = new WebDriverWait(driver, 20);
        driverx.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'post_message_')]/blockquote")));

        for(int i=0; i<=1; i++){
            for(int x=0; x<=9; x++) {
                String word = driver.findElements(By.xpath("//div[contains(@id, 'post_message_')]/blockquote")).get(x).getText();
                if(word.startsWith("Сообщение")){
                    int a = word.lastIndexOf("↵");
                    System.out.println(a);
                    word.substring(a);
                }
                System.out.println(word);
            }


        }


    }

}
