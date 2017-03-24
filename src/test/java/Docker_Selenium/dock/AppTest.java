package Docker_Selenium.dock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import Docker_Selenium.pageobject.LogIn;
import Docker_Selenium.pageobject.LogOut;

public class AppTest
{
	private static WebDriver driver=null;
	
	@Test
	public void Test()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"Driver/phantomjs");
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] {"--web-security=no", "--ignore-ssl-errors=yes"});
		driver = new PhantomJSDriver(caps);
		System.out.println(">>>Driver initiated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(">>>Browser window maximize");
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println(">>>URL triggered");
		LogIn.zero_user(driver).sendKeys("username");
		System.out.println(">>>Username entered");
		LogIn.zero_pass(driver).sendKeys("password");
		System.out.println(">>>Password entered");
		LogIn.zero_submit(driver).click();
		System.out.println(">>>Submit button clicked");
		System.out.println(">>>Inside the system");
		LogOut.click_dropdown(driver).click();
		LogOut.click_logout(driver).click();
		System.out.println(">>>Logged out of the system");
		driver.quit();
	}
}
