package Tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
//		xpath for row=//*[@id="countries"]/tbody/tr
//		xpath for col=//*[@id="countries"]/tbody/tr[1]/td
		List<WebElement> rowValue=driver.findElements(By.xpath("//*[@id=\'countries\']/tbody/tr"));
		int rowCount=rowValue.size();
		System.out.println(rowCount);
		List<WebElement> colValue=driver.findElements(By.xpath("//*[@id=\'countries\']/tbody/tr[1]/td"));
		int colCount=colValue.size();
		System.out.println(colCount);
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<=colCount;j++)
			{
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement d=driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+(i+1)+"]/td[1]/input"));
			    d.click();	
			    wait.until(ExpectedConditions.elementToBeClickable(d));
//				System.out.println(driver.findElement(By.xpath("//*[@id=\'countries']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		


	}

}
