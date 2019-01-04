package thiru239;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_All_Checkboxes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> l= (List<WebElement>) driver.findElement(By.xpath("//*[@type='checkbox']"));
		for(int i=0;i<l.size();i++)
		{
			((WebElement) l.get(i)).click();
		}

	}

}
