package thiru239;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='yDmH0d']")).sendKeys("thirupathimstr123@gmail.com");
	
	}

}
