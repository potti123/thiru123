package thiru239;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Data_driven_way2sms 
{
	public static void main(String[] args)throws Exception
	{

		File f=new File("E:\\way2sms.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet rsh=wb.getSheet(0);
		int nour=rsh.getRows();
		for(int i=1;i<nour;i++)
		{
			System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.way2sms.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("mobileNo")).sendKeys(rsh.getCell(0,i).getContents());
			driver.findElement(By.name("password")).sendKeys(rsh.getCell(1,i).getContents());
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@type='button'])[3]")).click();
			Thread.sleep(5000);
			driver.close();
		}
		wb.close();

	}

}
