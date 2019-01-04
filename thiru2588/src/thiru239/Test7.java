package thiru239;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("secured site");
		}
		else
		{System.out.println("not secured");
		
		}
		

	}

}
