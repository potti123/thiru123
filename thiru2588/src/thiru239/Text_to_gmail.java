package thiru239;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_to_gmail 
{
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();	
	driver.get("https://accounts.google.com/signup");
	File f=new File("E:\\Texttogmail.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	String l="";
	while((l=br.readLine())!=null) 
	{
	String[] s=l.split(",");
	driver.findElement(By.name("firstName")).sendKeys(s[0]);
	driver.findElement(By.name("lastName")).sendKeys(s[1]);
	driver.findElement(By.name("Username")).sendKeys(s[2]);
	driver.findElement(By.name("Passwd")).sendKeys(s[3]);
	driver.findElement(By.name("ConfirmPasswd")).sendKeys(s[4]);
	
	
	
	}
}

}
