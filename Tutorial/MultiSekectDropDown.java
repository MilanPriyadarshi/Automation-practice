package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSekectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop=driver.findElement(By.xpath("//*[@id=\'post-2646\']/div[2]/div/div/div/p/select"));
		Select select =new Select(drop);
		select.selectByIndex(5);
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		List<WebElement> allOptions=select.getAllSelectedOptions();
		System.out.println(allOptions.size());
		

	}

}
