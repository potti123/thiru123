package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.android.dx.rop.cst.CstArray.List;



public class javaScript_required_item
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		java.util.List<WebElement> l=driver.findElements(By.xpath("//*[@role='presentation']/div/div[2]"));
		System.out.println(l.size());
		for(int i=4;i<l.size();i++)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("var v=arguments[0].textContent;window.alert(v);",l.get(i));
			Thread.sleep(5000);
			String x=driver.switchTo().alert().getText();
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();
			System.out.println(x);
			if(x.equals("kalamandir"));
			{
				driver.findElement(By.name("q")).clear();
				driver.findElement(By.name("q")).sendKeys(x);
				break;
			}
		}
		driver.close();
			}
			
		}
		
		
		
