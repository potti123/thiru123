package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Required_item_in_cache_with_javascript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		int c=0;
		while(2>1)
		{
			String x=driver.findElement(By.name("q")).getAttribute("value");
			if(x.equals("kalamer shakti"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(5000);
				break;
			}
			else
			{
				a.sendKeys(Keys.DOWN).build().perform();
				c=c+1;
					if(c>10)
					{
						a.sendKeys(Keys.ESCAPE).build().perform();
						break;	
					}
			
		}
		}
				
		}
		}