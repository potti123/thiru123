package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Width_Height 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		int wdth=e.getSize().getWidth();
		int ht=e.getSize().getHeight();
		System.out.println(wdth);
		System.out.println(ht);

	}

}
