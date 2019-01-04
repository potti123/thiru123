package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dispyselectdenabled
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.get("https://www.mercurytravels.co.in");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='flights']")).click();
			Thread.sleep(5000);
			try
			{
				WebElement e=driver.findElement(By.xpath("(//*[@name='tripType'])[2]"));
				//check oneway is displayed or not
				if(e.isDisplayed())
				{
					//check one way is enable or not
					if(e.isEnabled())
					{
						e.click();
						//check one way is selected or not
						if(e.isSelected())
						{
							System.out.println("selected");
						}
						else
						{
							System.out.println("not selected");
						}
					}
					else
					{
						System.out.println("Disabled");
					}
				}
				else
				{
					System.out.println("not Disabled");
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			driver.close();
						}
					}
				
						
			
			
			

	


