package Docker_Selenium.dock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Docker_Selenium.pageobject.LogIn;
import Docker_Selenium.pageobject.LogOut;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class AppTest
{
	private static WebDriver driver=null;
	
	@Test
	public void Test()
	{
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/login.html");
		LogIn.zero_user(driver).sendKeys("username");
		LogIn.zero_pass(driver).sendKeys("password");
		LogIn.zero_submit(driver).click();
		LogOut.click_dropdown(driver).click();
		LogOut.click_logout(driver).click();
		driver.quit();
	}
}
