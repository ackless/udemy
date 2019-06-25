import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LongWord {

    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.govorimpro.us/%D0%B8%D0%B3%D1%80%D1%8B-%D0%B8-%D1%82%D0%B5%D1%81%D1%82%D1%8B/51339-%D0%B8%D0%B3%D1%80%D0%B0-%D0%B1%D0%B5%D1%81%D0%BA%D0%BE%D0%BD%D0%B5%D1%87%D0%BD%D0%BE%D0%B5-%D1%81%D0%BB%D0%BE%D0%B2%D0%BE.html");


        for (int i = 0; i <= 1; i++) {
            WebDriverWait driverx = new WebDriverWait(driver, 2);
            driverx.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'post_message_')]/blockquote")));

            for (int x = 0; x <= 9; x++) {
                String word = (driver.findElements(By.xpath("//div[contains(@id, 'post_message_')]/blockquote")).get(x).getText()).toLowerCase();
                if (word.startsWith("Сообщение")) {

                    String wordd = word.substring(word.lastIndexOf("\n") + 1);
                    wordd = wordd.substring(0, 1).toUpperCase() + wordd.substring(1);
                    System.out.print(wordd + "-");
                } else {
                    word = word.substring(0, 1).toUpperCase() + word.substring(1);
                    System.out.print(word + "-");
                }

            }
            driver.findElement(By.xpath("//a[@rel='next']")).click();
        }


    }

}
