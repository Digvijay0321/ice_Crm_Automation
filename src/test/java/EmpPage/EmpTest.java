package EmpPage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;

public class EmpTest extends BaseClass1{
	
	PropertyHandling propertyHandling;

	@BeforeClass
	public void before(){
	propertyHandling = new PropertyHandling();
	}
	@Test
	public void login(){
	            String url = propertyHandling.getProperty("orangeHrmür1");
                 launchBrowser ("edge");
	            driver.navigate().to(url);
	            String username =propertyHandling.getProperty("orangeHirmusername");
	            enterText(By.name("username"), username);
            	String password = propertyHandling.getProperty("orangeHraPassword"); 
	            enterText(By.name("password"), password);
            	click(By.xpath("//button[@type='submit']"));
	}
	@Test
	public void test() {
	String url = propertyHandling.getProperty("icehraUrl");
	System.out.println(url);
}
}
	