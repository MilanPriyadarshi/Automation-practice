package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement s=driver.findElement(By.xpath("//*[@id=\'how-select\']"));
		Select select= new Select(s);
		select.selectByValue("Event");
		Thread.sleep(2000);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByVisibleText("Word of Mouth/Referral");
		driver.close();
		

	}

}
