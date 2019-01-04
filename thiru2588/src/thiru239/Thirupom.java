package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Thirupom
{
	
public static void main(String[] args)
	{
	try
	{
	System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	 Redbussignin rsi=new Redbussignin(driver);
	 Redbussignnext rsn=new Redbussignnext(driver);
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebDriverWait w=new WebDriverWait(driver,20); 
	w.until(ExpectedConditions.visibilityOf(rsi.signin1));
    rsi.clicksignin1();
    w.until(ExpectedConditions.visibilityOf(rsn.signin2));
     rsn.clicksignin2();
	}
	catch(Exception ex)
	{
		
	}
     
     
	}

}
