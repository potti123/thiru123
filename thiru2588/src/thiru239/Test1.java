package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args)
	{

  System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.google.com/");
  driver.findElement(By.name("q")).sendKeys("abdul kalam");
  driver.findElement(By.id("gsr")).click();
	}

}
