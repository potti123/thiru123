package thiru239;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbussignnext 
{
	public WebDriver driver;
	@FindBy(xpath="//*[text()='Sign In/Sign Up']")
	public WebElement signin2;
	public Redbussignnext(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clicksignin2()
	{
		signin2.click();
	}
}
