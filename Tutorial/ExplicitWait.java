package Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

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
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(target2)).click();
		driver.close();
	}

}
