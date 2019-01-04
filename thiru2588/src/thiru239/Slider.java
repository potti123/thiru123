package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));
		Actions a=new Actions(driver);
		int x=e1.getLocation().getX();
		int y=e1.getLocation().getY();
		//slider from left to right
		a.dragAndDropBy(e1,x+200,y).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e2=driver.findElement(By.xpath("//*[contains(@class,'ui-slider-handle')]"));
		int p=e2.getLocation().getX();
		int q=e2.getLocation().getY();
		a.dragAndDropBy(e2,p,q-150).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
	}

		
		
		
		
		
		
		
	}



