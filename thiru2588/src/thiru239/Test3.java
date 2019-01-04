package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("vemula");
	driver.findElement(By.name("lastName")).sendKeys("thirupathi");
	driver.findElement(By.name("phone")).sendKeys("9492266105");
	driver.findElement(By.name("userName")).sendKeys("thirupathimstr123@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("rvm");
	driver.findElement(By.name("address2")).sendKeys("vmd");
	driver.findElement(By.name("city")).sendKeys("sircilla");
	driver.findElement(By.name("state")).sendKeys("telangana");
	driver.findElement(By.name("postalCode")).sendKeys("505402");
	Select s=new Select(driver.findElement(By.name("country")));
	s.selectByVisibleText("INDIA");
	driver.findElement(By.name("email")).sendKeys("THIRUPATHIMSTR123@GMAIL.COM");
	driver.findElement(By.name("password")).sendKeys("9492266105t");
	driver.findElement(By.name("confirmPassword")).sendKeys("9492266105t");
	driver.findElement(By.name("register")).click();
	driver.close();

	
	}
}