package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_element_in_page {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.google.co.in");
		  WebElement e=driver.findElement(By.name("q"));
		  JavascriptExecutor js=( JavascriptExecutor) driver;
		  js.executeScript("arguments[0].style.border='3px dotted blue';",e);
		  
		  
		 

	}

}
