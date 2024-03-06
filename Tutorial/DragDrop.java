package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame1=driver.findElement(By.id("google_esf"));
		driver.switchTo().frame(frame1);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target);
		


	}

}
