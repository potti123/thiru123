package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("http://www.way2sms.com");
		driver.findElement(By.name("username")).sendKeys("9492266105");
		driver.findElement(By.name("password")).sendKeys("priya");
		driver.findElement(By.id("loginBTN")).click();
		String z=driver.findElement(By.xpath("//*[@id='sendSMS']/a")).getText();
		System.out.println(z);
		
		
	}

}
