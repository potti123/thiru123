package thiru239;



import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Window_Handles 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com");
		Set st=driver.getWindowHandles();
		Iterator it=(Iterator) st.iterator();
		/*String mainWindow=it.next();
		String popUp=it.next();
		driver.switchTo().window(popUp).close();
		driver.switchTo().window(mainWindow);*/

	}

}
