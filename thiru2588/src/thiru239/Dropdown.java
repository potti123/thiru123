package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Automate drop down which not allow char matching
		WebElement e1=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.click(e1).build().perform();
		Thread.sleep(5000);
		for(int i=1;i<=2;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
	
	
		//Automate drop down which can allow char matching
		WebElement e2=driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		a.click(e2).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		
	}
}