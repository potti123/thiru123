package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("thirupathimstr123");
		try
		{
		if(driver.findElement(By.xpath("//*[@id='identifierId']")).isDisplayed())
		{
			System.out.println("displyed");
		}
		else
		{
			System.out.println("not Displyed");
		}
		}
		catch(Exception e)
		
		{
			System.out.println(e.getMessage());
			
		}
	
		
	}

}
