package webDriverProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys("Test");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("Demo");
		 Thread.sleep(2000);
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
	}

}
