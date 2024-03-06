package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		List <WebElement> allLink=driver.findElements(By.tagName("a"));
		System.out.println(allLink.size());
		for(int i=0;i<allLink.size();i++)
		{
			System.out.println("Links are :"+ allLink.get(i).getAttribute("href"));
			System.out.println("Visisble Text :"+ allLink.get(i).getText());
		}
		

	}

}
