package thiru239;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crossbrouser {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		WebDriver driver;
		try
		{
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		}
		catch(Exception e)
		{
			System.setProperty("webdriver.gecko.driver","E:\\java258\\geckodriver.exe");
			driver=new ChromeDriver();
		}

	}

}
