
package testcases;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
	
	@Test(priority=3)
	public void search() {
		
		dp.searchShares();
	}
	

}
