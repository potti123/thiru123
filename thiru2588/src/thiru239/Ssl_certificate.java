package thiru239;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Ssl_certificate
{
	public static void main(String[] args)
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//launch site
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(dc);
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");


	}

}
