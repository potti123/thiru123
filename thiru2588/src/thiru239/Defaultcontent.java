package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Defaultcontent
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("http://www.way2sms.com");
		driver.findElement(By.name("username")).sendKeys("9492266105");
		driver.findElement(By.id("loginBTN")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.name("password")).sendKeys("priya");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("frame");
		//Thread.sleep(10000);
		driver.findElement(By.name("mobile")).sendKeys("9492266105");
		Thread.sleep(5000);
		driver.findElement(By.name("message")).sendKeys("hi ");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[@class='lout']")).click();
		
		


	}

}
