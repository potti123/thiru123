package thiru239;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robot_gmail {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
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
			//click compose
			driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
			Thread.sleep(5000);
			//fill fields
			driver.findElement(By.name("to")).sendKeys("thirupathivemula67@gmail.com");
			driver.findElement(By.name("subjectbox")).sendKeys("wishes from thiru");
			driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("hi,\nhow are you.\nwhere are you");
			driver.findElement(By.xpath("//*[@aria-label='Attach files']/descendant::*[3]")).click();
			//Attach file(java Robot)
			StringSelection s=new StringSelection("C:\\Users\\Thirupathi\\Pictures\\Camera Roll\\MRV_20180521_22_08_52.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
			Thread.sleep(5000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//send mail(SWD)
			WebDriverWait w=new WebDriverWait(driver,100);
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role=’progressbar’][@class='dQ']")));
			w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@role=’progressbar’][@class='dQ']")));
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Send']")));
			driver.findElement(By.xpath("//*[text()='Send']")).click();
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@aria-live='assertive'])[3]")));
			String x=driver.findElement(By.xpath("(//*[@aria-live='assertive'])[3]/descendant::*[3]")).getText();
			System.out.println(x);
			//Do logout
			
			
			
			
			
	}

}
