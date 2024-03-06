package webDriverProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
		 user.sendKeys("standard_user");
		 WebElement pass=driver.findElement(By.id("password"));
		 pass.sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
	}

}
