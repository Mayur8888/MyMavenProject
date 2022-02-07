package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
	
	this.driver=driver;
	
	
}
	
	public void initialLogin() {
		
		WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
		username.sendKeys("REE301");
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("Gou@781990");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		loginbutton.click();
	}
	 public void finalLogin() {
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 WebElement pin = driver.findElement(By.xpath("//*[@id='pin']"));
		 
		 pin.sendKeys("787898");
		 
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
//		 driver.findElement(By.xpath("//*[@name='alert']")).click();
//		 driver.findElement(By.xpath("//*[@name='Block']")).click();
//		 driver.switchTo().alert().dismiss();
	 }
	 
	 public boolean geturl() {
		 
		 WebDriverWait wait = new WebDriverWait(driver,60);
		 
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='button button-blue']")));
		 
		 String url = driver.getCurrentUrl();
		 
		 System.out.println(url);
		 
		 if(url.contains("dashboard")) {
					 return true;
		 }
		 else{
			
			        return false;
		 }
		 
		 
	 }
	
	
       

}
