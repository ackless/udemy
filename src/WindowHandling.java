import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Iterator;
import java.util.Set;


public class WindowHandling{

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//div[@class='example']/a")).click();

		Set<String> tabList = driver.getWindowHandles();
		Iterator<String> tabs = tabList.iterator();

		String parentTab = tabs.next();
		String childTab = tabs.next();

		//child text
		driver.switchTo().window(childTab);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

		//parent text
		driver.switchTo().window(parentTab);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}