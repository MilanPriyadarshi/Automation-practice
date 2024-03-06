package General;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AdvancedExcelJava {

	public static void main(String[] args) throws BiffException, IOException {
		Workbook wb=Workbook.getWorkbook(new File("C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\Reader.xls"));
		Sheet sh=wb.getSheet("read2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Actions ac=new Actions(driver);
		
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement pass=driver.findElement(By.id("password"));
		
		for(int i=1;i<sh.getRows();i++)
		{
			String data=sh.getCell(0, i).getContents();
			
			ac.click(user).sendKeys(data).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).click(pass)
			.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			user.clear();
			pass.clear();
		}
		driver.close();

	}

}
