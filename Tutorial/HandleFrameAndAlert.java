package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameAndAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
		WebElement text = driver.findElement(By.id("text"));
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		

	}

}
