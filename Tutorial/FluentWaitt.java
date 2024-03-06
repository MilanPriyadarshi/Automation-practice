package Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

@SuppressWarnings("unused")
public class FluentWaitt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement target=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(target).perform();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);--->Its deprecated.
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement target2=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[5]/a"));
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofMillis(2))
		            .withMessage("Welcome to selenium tutorial")
		            .ignoring(NoSuchElementException.class);
		
		driver.close();
	}

}
