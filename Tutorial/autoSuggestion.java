package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement f=driver.findElement(By.xpath("//input[@placeholder='From']"));
		f.sendKeys("Bhubaneswar");
		Thread.sleep(2000);
		f.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		f.sendKeys(Keys.ENTER);

	}

}
