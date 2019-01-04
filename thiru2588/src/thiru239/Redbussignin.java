package thiru239;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbussignin 
{
public WebDriver driver;
@FindBy(xpath="//*[@id='i-icon-profile']")
public WebElement signin1;
public Redbussignin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clicksignin1()
{
	signin1.click();
}
}
