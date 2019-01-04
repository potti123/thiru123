package thiru239;



import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class Millinium_clouds
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.millionclouds.com/");
		Screen s=new Screen();
		s.click("adobe.png");
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		s.click("allow.png");
		while(2>1)
		{
			if(s.exists("login.png")!=null)
			{
				s.click("login.png");
				break;
			}
		}
		s.type("username.png","srinath");
		s.type("pwd.png","sr");
		s.click("log.png");
		Thread.sleep(5000);
		Settings.OcrTextSearch=true;
		Settings.OcrTextRead=true;
		Region r=new Region(268,350,256,40);
		String x=r.text();
		System.out.println(x);
	}

}
