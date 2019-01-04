package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_sample 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://semantic-ui.com/modules/dropdown.html");
		  WebElement e=driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		  // Actions a=new Actions(driver);
		  JavascriptExecutor js=( JavascriptExecutor)driver;
		  WebElement e2=driver.findElement(By.xpath("(//*[text()='Selection'])[2]"));
		  js.executeScript("arguments[0].scrollIntoView();", e2);
		  js.executeScript("arguments[0].style.border='2px dotted blue';",e);
		  

	}



}
