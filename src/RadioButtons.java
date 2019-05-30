import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.echoecho.com/htmlforms10.htm");

        int listSize = driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println("The size of the \"group 1\" is " + listSize + " element/s");

        System.out.println("Lets get names of the radiobutton\'s elements:");
        for (int i = 0; i < listSize; i++) {
            String value = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            System.out.println(value);
            if (value.equals("Cheese")) {
                System.out.println("Let's click on Cheese");
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }
        }


    }


}
