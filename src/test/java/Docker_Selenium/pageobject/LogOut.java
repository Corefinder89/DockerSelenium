package Docker_Selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOut 
{
	public static WebElement element;
	
	public static WebElement click_dropdown(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='settingsBox']/ul/li[3]/a"));
		return element;
	}
	
	public static WebElement click_logout(WebDriver driver)
	{
		element = driver.findElement(By.id("logout_link"));
		return element;	
	}
}
