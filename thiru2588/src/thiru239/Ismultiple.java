package thiru239;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.switchTo().frame("iframeResult");
			WebElement e=driver.findElement(By.name("cars"));
			Select s=new Select(e);
			if(s.isMultiple())
			{
				System.out.println("multi select");
			}
			else
			{
				System.out.println("single select");
				
			}
	}

}
