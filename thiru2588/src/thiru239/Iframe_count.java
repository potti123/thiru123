package thiru239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_count {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com");
		List<WebElement> l=driver.findElements(By.tagName("iframe"));
		System.out.println("The total no of iframes are: " +l.size());
		

	}

}
