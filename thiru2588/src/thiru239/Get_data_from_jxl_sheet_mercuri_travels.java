package thiru239;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Get_data_from_jxl_sheet_mercuri_travels
{
	public static void main(String[] args)throws Exception
	{

		File f=new File("E:\\Mercuri2.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet rsh=wb.getSheet(0);
		//int nour=rsh.getRows();
		//for(int i=1;i<nour;i++)
		
			System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.newtours.demoaut.com");
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys(rsh.getCell(0,1).getContents());
			driver.findElement(By.name("lastName")).sendKeys(rsh.getCell(1,1).getContents());
			driver.findElement(By.name("phone")).sendKeys(rsh.getCell(2,1).getContents());
			driver.findElement(By.name("userName")).sendKeys(rsh.getCell(3,1).getContents());
			driver.findElement(By.name("address1")).sendKeys(rsh.getCell(4,1).getContents());
			driver.findElement(By.name("address2")).sendKeys(rsh.getCell(5,1).getContents());
			driver.findElement(By.name("city")).sendKeys(rsh.getCell(6,1).getContents());
			driver.findElement(By.name("state")).sendKeys(rsh.getCell(7,1).getContents());
			driver.findElement(By.name("postalCode")).sendKeys(rsh.getCell(8,1).getContents());
			//driver.findElement(By.name("")).sendKeys(rsh.getCell(9,1).getContents());
			
			
	}

}
