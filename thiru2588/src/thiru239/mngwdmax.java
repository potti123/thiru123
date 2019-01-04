package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class mngwdmax {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java258\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.get("https://www.mercurytravels.co.in");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.findElement(By.id("flights")).click();
			int w=driver.manage().window().getSize().getWidth();
			int h=driver.manage().window().getSize().getHeight();
			System.out.println(w+" "+h);
			Dimension d=new Dimension(300,500); 
			driver.manage().window().setSize(d);
			Thread.sleep(5000);
			//get position
			int x=driver.manage().window().getPosition().getX();
			int y=driver.manage().window().getPosition().getY();
			System.out.println(x+" "+y);
			//set position
			Point p=new Point(100,400);//x&y
			driver.manage().window().setPosition(p);
			Thread.sleep(5000);
			driver.close();
			
			
			
			

	}

}
