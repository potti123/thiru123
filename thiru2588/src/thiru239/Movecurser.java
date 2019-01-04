package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movecurser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//close banner if exist
		if(driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).isDisplayed())
			Thread.sleep(5000);
	{
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
	}
		//move mouse pointer to an element
		WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("(//*[text()='Sarees'])[1]")).click();
		a.moveByOffset(100,200).build().perform();
}
}