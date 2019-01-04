package thiru239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Required_item_using_javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//fill text box
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		//get options visible in auto-complete/cache
		List<WebElement> l=driver.findElements(By.xpath("//*[@role='presentation']/div/div[2]"));
		Thread.sleep(5000);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("var v=arguments[0].textContent;window.alert(v);",l.get(i));
			String x=driver.switchTo().alert().getText();
			driver.switchTo().alert().dismiss();
			System.out.println(x);
			if(x.contains("kalamer shakti"))
			{
				/*Actions a=new Actions(driver);
				a.sendKeys(Keys.ENTER).build().perform();*/
				driver.findElement(By.name("q")).clear();
				driver.findElement(By.name("q")).sendKeys(x);
				break;
			}
			
		}
		

		
	}

}
