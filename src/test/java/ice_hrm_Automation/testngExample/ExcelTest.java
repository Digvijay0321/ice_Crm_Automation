package ice_hrm_Automation.testngExample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ice_hrm_Automation.Baseclass;
import com.ice_hrm_Automation.EmpDetails;
import com.ice_hrm_Automation.ExcelUtil;

public class ExcelTest extends Baseclass {
	@DataProvider
	public Object[][] getTestData() { 
		ExcelUtil excelUtil = new ExcelUtil();
        String filePath = "H:\\New/Book1.xlsx";
        String sheetName = "TestData";
	    return excelUtil.getExcelData(filePath, sheetName); 
	 }
	@Test(dataProvider = "getTestData")
	public void test(String username, String password) {
	System.out.println(username + " " + password);
	}
	@DataProvider
	public Object[][] getEmpData() { 
		ExcelUtil excelUtil = new ExcelUtil();
	    String filePath = "H:\\New/Book1.xlsx";
	    String sheetName = "TestData";
	return excelUtil.getEmpData(filePath, sheetName); 
	}
	@Test(dataProvider = "getEmpData") 
	public void empTest (EmpDetails empDetails) {
		 System.out.println("This is launch the Browser ");
		  launchBrowser("edge");	 
		  driver.get("https://icehrm.com/app/cybersuccess/login.php");
		  enterText(By.id("username"), "admin");
		  enterText(By.id("password"), "2zuzfakn");
		  click(By.xpath("//button[contains (text(),\"Log in \")]"));
		  click(By.xpath("//span[text()=\"Employees\"]"));
		  click(By.xpath("//ul[@id=\"admin_Employees\"]//a"));	 
 driver.close();
	}
}
