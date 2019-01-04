package thiru239;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Google_title_testing 
{
	public static void main(String[] args)throws Exception
	{
	//get input word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
	//create result files using extent reports
		ExtentReports er=new ExtentReports("googleresult.html",false);
		ExtentTest et=er.startTest("Google Title test");
		//launch site
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		//search word
		driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		//check title
		String y=driver.getTitle();
		if(y.contains(x))
		{//[@class='signin-screen']
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("passscr.png");
			FileUtils.copyFile(src,dest);
			et.log(LogStatus.PASS,"Title test passed");
			et.log(LogStatus.PASS,et.addScreenCapture("passscr.png"));
		}
		else
		{
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("failscr.png");
			FileUtils.copyFile(src,dest);
			et.log(LogStatus.FAIL,"Title test passed");
			et.log(LogStatus.FAIL,et.addScreenCapture("failscr.png"));	
		}
		Thread.sleep(30000);
		driver.close();
		er.endTest(et);
		er.flush();
		
		}
	}


