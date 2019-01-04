package thiru239;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Tool_tip 
{
	public static void main(String[] args) throws Exception
	{
	//launch site
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/Css/Css_tooltip.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get tool tip via title Attribute
		WebElement e1=driver.findElement(By.linkText("JAVASCRIPT"));
		String x=e1.getAttribute("title");
		System.out.println(x);
		Thread.sleep(5000);
		//Scroll page to Specific element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e2=driver.findElement(By.xpath("//*[text()='Demo: Tooltip Examples']"));
		js.executeScript("arguments[0].scrollIntoView();",e2);
		Thread.sleep(5000);
		//move mouse pointer to element for tool visibility
		WebElement e3=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(e3).clickAndHold().build().perform();
		Thread.sleep(5000);
		WebElement e4=driver.findElement(By.xpath("(//*[@class='tooltip'])[1]/span"));
		String y=e4.getText();
		System.out.println(y);
		a.release().build().perform();
		//close site
		
		

	}

}
