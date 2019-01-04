package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_travelling_date
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		if(driver.findElement(By.xpath("//*[@placeholder='Enter Captcha']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@class='fa fa-window-close pull-right']")).click();
		}
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("secunderabad");
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("MUMBAI CENTRAL - BCT");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']")).click();
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Thread.sleep(5000);
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c14-6 ng-star-inserted']/tbody/tr[4]/td[3]")).click();
		

	}

}
