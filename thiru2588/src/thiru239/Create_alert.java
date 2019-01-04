package thiru239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get invisible items from <div> based drop down
		List<WebElement> l=driver.findElements(By.xpath("(//*[contains(@class,'dropdown selection multiple')])[1]/div[2]/div"));
		System.out.println(l.size());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<l.size();i++)
		{
			js.executeScript("var x=arguments[0].textContent;alert(x);",l.get(i));
			String y=driver.switchTo().alert().getText();
			System.out.println(y);
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();
		}

	}

}
