package thiru239;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Sikuli_youtub 
{
public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("abdul kalam speech");
	driver.findElement(By.xpath("(//*[@class='style-scope ytd-searchbox'])[5]")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("A P J Abdul Kalam in European")).click();
	Screen s=new Screen();
	Location l=new Location(200,300);
	s.wheel(l,Button.LEFT,0);
	s.click("pause.png");
	s.click("play.png");
	//s.wheel(l,Button.LEFT,0);
	s.mouseMove("volume.png");
	Thread.sleep(5000);
	Match e=s.find("bubble.png");
	int x=e.getX();
	int y=e.getY();
	Location dl1=new Location(x-20,y);
	s.dragDrop(e,dl1);
	Thread.sleep(5000);
	Location dl2=new Location(x+30,y);
	s.dragDrop(e,dl2);
	s.wheel(Button.WHEEL_DOWN,10);
	s.wheel(Button.WHEEL_UP,10);
	
	
	

	}

}
