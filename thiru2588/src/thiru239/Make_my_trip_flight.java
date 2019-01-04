package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip_flight 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("(//*[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[1]")).click();
		
		/*Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[text()='Chennai, India '])[1]"));
			
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//*[text()='Goa, India '])[2]")).click();*/
		driver.findElement(By.xpath("(//*[@class='checkSpecialCharacters'])[1]")).click();
		for(int i=0;i<=2;i++)
		{
			driver.findElement(By.xpath("(//a[@title='Next'])[1]")).click();
		}
			
	}
	

}
