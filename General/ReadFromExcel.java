package General;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadFromExcel {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		Workbook wb= Workbook.getWorkbook(new File("C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\Reader.xls"));
		Sheet sh=wb.getSheet("read");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LAXMIPRIYA LENKA\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
		 WebElement pass=driver.findElement(By.id("password"));
		for(int i=1;i<sh.getRows();i++)
		{
			user.sendKeys(sh.getCell(0, i).getContents());
			pass.sendKeys(sh.getCell(1, i).getContents());
			Thread.sleep(2000);
			pass.clear();	
			user.clear();
					
		}
		driver.close();
		

	}

}
