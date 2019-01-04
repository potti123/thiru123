package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_web_pages 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//scroll to bottom
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHight);");
		Thread.sleep(5000);
		//scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHight,0);");
		Thread.sleep(5000);
		//scroll to specific element in page
		WebElement e=driver.findElement(By.xpath("(//*[text()='Select Country'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		
		
		
		
	}

}
