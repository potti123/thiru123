package thiru239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_a_text_from_webelement  
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			//driver.get("https://www.google.com");
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			//Do log in
			//driver.findElement(By.xpath("//*[text()='Sign In']")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("identifier")).sendKeys("thirupathimstr123@gmail.com");
			String x= driver.findElement(By.xpath("//*[text()='Next']")).getText();
			String y=driver.getTitle();
			System.out.println(x);
			System.out.println(y);
	}

}
