package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactory.HotmailLoginPage;

public class TestLogin {
	WebDriver driver;
	HotmailLoginPage loginPage;
	
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		driver.get("https://login.live.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testLogin() throws InterruptedException{
		loginPage = new HotmailLoginPage(driver);
		loginPage.login("rohit.nidhi@hotmail.com","rohit@10128", 'Y');
	}
}
