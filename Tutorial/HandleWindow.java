package Tutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		Thread.sleep(4000);
		Set<String> WindowHandles=driver.getWindowHandles();
		Iterator<String> iterator= WindowHandles.iterator();
		String parentWindow=iterator.next();
		String childWindow=iterator.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Milan");
		driver.findElement(By.name("UserLastName")).sendKeys("Sutar");
		driver.switchTo().window(parentWindow);
		driver.quit();
		
	}

}
