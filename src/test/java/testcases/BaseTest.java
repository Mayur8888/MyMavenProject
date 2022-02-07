package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LoginPage;

public class BaseTest {
	static WebDriver driver; 
	LoginPage lp;
	DashboardPage dp;
	
	@BeforeSuite
	public void initBrowser() {
		
//		System.setProperty("webdriver.chrome.driver","D:\\AAA Gaurav Sir Notes\\Selenium SW\\ChromeDrivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		
	}
	
	@BeforeClass
	public void createObject() {
		
		 lp = new LoginPage(driver);
		 dp = new DashboardPage(driver);
		
	}
	
	

}
