package src;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;


public class AddToCart {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(1000L);

        List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));
        String[] requiredProducts = {"Brocolli", "Beetroot","Tomato"};
        int j=0;
        for (int i=0; i<products.size(); i++) {
            String[] productNameRaw = products.get(i)
                    .findElement(By.className("product-name"))
                    .getText()
                    .split("-");
            String productName = productNameRaw[0].trim();

            // List of required products should be converted to an arrayList for easy search
            List requiredProductsAsList = Arrays.asList(requiredProducts);

            if(requiredProductsAsList.contains(productName)){
                if(productName.equals("Tomato")){
                    driver.findElements(By.xpath("//div[@class='stepper-input']/input")).get(i).clear();
                    driver.findElements(By.xpath("//div[@class='stepper-input']/input")).get(i).sendKeys("8");
                }
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                j++;
                if(j==requiredProducts.length){
                    break;
                }
            }
        }
    }

}
