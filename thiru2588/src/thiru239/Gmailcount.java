package thiru239;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailcount
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","E:\\java258\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
			//driver.get("https://www.google.com");
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			//Do log in
			//driver.findElement(By.xpath("//*[text()='Sign In']")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("identifier")).sendKeys("thirupathimstr123@gmail.com");
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			Thread.sleep(10000);
			driver.findElement(By.name("password")).sendKeys("9492266105t");
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			Thread.sleep(10000);
			//get count of mails in mail box
			int c=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr")).size();
			System.out.println(c);
			//select 6th mail in mail box
			driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/tbody/tr[6]/td[2]/div")).click();
			Thread.sleep(5000);
			//delete mail
			driver.findElement(By.xpath("//*[contains(@style,'margin')]/descendant::div[11]/div[3]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label='Account Information']/preceding::span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Sign out")).click();
			
					
	}

}
