package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class P1 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Sridhar.869132@yahoo.co.in");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("palimkar@123");
		driver.findElement(By.name("verifyPassword")).click();
		
		
		
	}

}
