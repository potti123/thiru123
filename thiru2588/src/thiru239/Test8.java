package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		driver.quit();

	}

}
