package thiru239;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectdeselectdropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get details
		Scanner sc=new Scanner(System.in);
		System.out.println("No: of items to select");
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter item to be selected");
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextLine());
		}
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//open Multi -select drop down
		driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']")).click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		//select item
		for(int i=0;i<n;i++)
		{
			while(2>1) //infinite loop
			{
				String x=driver.findElement(By.xpath("(//*[@class='item selected'])[1]")).getAttribute("data-value");
				if(x.equalsIgnoreCase(al.get(i)))
				{
				a.sendKeys(Keys.ENTER).build().perform();
				break;  //terminate from while loop
				}
				else
				{
					a.sendKeys(Keys.DOWN).build().perform();
					Thread.sleep(5000);
				}
			}
				
		}
		//de select 2nd items in selected items
		driver.findElement(By.xpath("(//*[@class='delete icon'])[2]")).click();
		

	}
}
