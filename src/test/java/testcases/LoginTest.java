package testcases;

import org.testng.annotations.Test;
import org.testng.Assert;


public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void loginToApp() {
		
		lp.initialLogin();
		lp.finalLogin();
	}
	
		@Test(priority=2)
	public void verifyUrl() {
		
	
		boolean valuereturned = lp.geturl();
		
		Assert.assertTrue(valuereturned,"test case failed");
		
	}	
	}
	
	


