package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\java258\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.gmail.com");
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(10000);
	driver.findElement(By.name("Email")).sendKeys("thirupathimstr123@gmail.com");
	driver.findElement(By.xpath("//*[@id='next']")).click();
	Thread.sleep(10000);
	//driver.findElement(By.xpath("//*[name='Passed']")).sendKeys("9492266105t");
	Thread.sleep(10000);
	driver.findElement(By.name("Passwd")).sendKeys("9492266105t");
	
	driver.close();
	
	}

}
