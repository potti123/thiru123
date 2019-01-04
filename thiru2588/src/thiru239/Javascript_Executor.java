package thiru239;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('lst-ib').style.border='2px dotted red';");
		

	}

}
