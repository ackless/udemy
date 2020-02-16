package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Calendar {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait driverWait = new WebDriverWait(driver, 10);

        driver.get("https://www.aviasales.ru/");
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'trip-duration__field') and contains(@class, '--departure')]")));

        driver.findElement(By.xpath("//div[contains(@class, 'trip-duration__field') and contains(@class, '--departure')]")).click();
        WebElement firstCalendar = driver.findElement(By.className("calendar__month"));
        Select months = new Select(driver.findElement(By.className("calendar-caption__select")));
        List<WebElement> dates = firstCalendar.findElements(By.xpath("//div[@class='calendar__day-cell ']"));

        months.selectByValue("2020-08");

        for(int i=0; i<dates.size();i++){
            String date = firstCalendar.findElements(By.xpath("//div[@class='calendar-day__date']")).get(i).getText();
            if(date.equalsIgnoreCase("27")){
                firstCalendar.findElements(By.xpath("//div[@class='calendar-day__date']")).get(i).click();
                break;
            }
        }

    }

}
