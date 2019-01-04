package thiru239;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_date_setting 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("secendrabad");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("MUMBAI CENTRAL - MMCT");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@type='button'])[4]/span")).click();
		for(int i=0;i<=2;i++)
		{
			for(int i1=0;i1<3;i1++)
			{
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();////*[@class='fa fa-angle-right']
			}
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c14-6 ng-star-inserted']/tbody/tr[4]/td[3]")).click();
}
}}