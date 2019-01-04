package thiru239;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Div_tag_collection 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\java258\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://semantic-ui.com/modules/dropdown.html");
		 int msdd=0;
		 int ssdd=0;
		 List<WebElement> l = driver.findElements(By.xpath("//div[contains(@class,'dropdown')]"));
		 for(int i=0;i<l.size();i++)
		 {
			 String s = l.get(i).getAttribute("class");
			 //System.out.println(s);
			 if(s.contains("multiple"))
			 {
				 msdd=msdd+1;// or msdd++
			 }
			 else
			 {
				 ssdd=ssdd+1;// or ssdd++
			 }
			 
		 }
		 System.out.println("multi select dropdowns :" +msdd);
		 System.out.println("single select dropdowns :" +ssdd);
		 
		  
		
		
	}

}
