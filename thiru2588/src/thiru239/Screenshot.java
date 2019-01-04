package thiru239;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\java258\\thiru1.png");
	FileUtils.copyFile(src, dest);
	
	}

}
