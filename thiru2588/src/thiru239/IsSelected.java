package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{

	 public static void main(String[] args) 
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
				driver.get("https://www.mercurytravels.co.in");
				driver.findElement(By.xpath("//*[@id='flights']")).click();
				driver.findElement(By.xpath("(//*[@name='tripType'])[2]")).click();
                 try
                 {
                	 if(driver.findElement(By.xpath("(//*[@name='tripType'])[2]")).isSelected())
                	 {
                		 System.out.println("selected");
                	 }
                	 else
                	 {
                		 System.out.println("not selected");
                	 }
                 }
                	 catch(Exception e)
                	 {
                		 System.out.println(e.getMessage());
                	 }
                 
                 
	}
}


