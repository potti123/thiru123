package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("http://www.way2sms.com");
		driver.findElement(By.name("username")).sendKeys("9492266105");
		String v=driver.findElement(By.name("username")).getCssValue("color");
		System.out.println(v);
		
	}

}
