package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("https://en-gb.facebook.com/login");
	driver.findElement(By.name("email")).sendKeys("thirupathivemula7@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9492266105t");
	driver.findElement(By.name("login")).click();
	
	
	}

}
