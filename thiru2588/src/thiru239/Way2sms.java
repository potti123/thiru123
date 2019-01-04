package thiru239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms 
{

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("http://www.way2sms.com");
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("9492266105");
	driver.findElement(By.name("password")).sendKeys("priya");
	driver.findElement(By.id("loginBTN")).click();
	driver.findElement(By.xpath("//*[@id='sendSMS']/a")).click();
	driver.switchTo().frame("frame");
	Thread.sleep(10000);
	driver.findElement(By.name("mobile")).sendKeys("9948220628");
	driver.findElement(By.name("message")).sendKeys("good night");
	driver.findElement(By.id("Send")).click();
	
	}

}
