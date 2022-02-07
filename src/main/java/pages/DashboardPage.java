package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//*[@type='button'])[2]")
	private WebElement getstartbutton;
	
	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement searchfield;
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
			
	}
	
	public void searchShares() {
		
		getstartbutton.click();
		searchfield.click();
		searchfield.sendKeys("SBIN");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchfield,Keys.ENTER).perform();
	}

}
