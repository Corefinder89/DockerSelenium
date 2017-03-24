package Docker_Selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn 
{
	public static WebElement element;
	
	public static WebElement zero_user(WebDriver driver)
	{
		element = driver.findElement(By.id("user_login"));
		return element;
	}
	
	public static WebElement zero_pass(WebDriver driver)
	{
		element = driver.findElement(By.id("user_password"));
		return element;
	}
	
	public static WebElement zero_submit(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
	}
}
