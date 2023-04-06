package ice_hrm_Automation.testngExample;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ice_hrm_Automation.Baseclass;

public class TestNGExample extends Baseclass{

	@BeforeMethod
	public void beforMethod() {
	  System.out.println("This is launch the Browser ");
	  launchBrowser("edge");	 
	  driver.get("https://icehrm.com/app/cybersuccess/login.php");
	  enterText(By.id("username"), "admin");
	  enterText(By.id("password"), "2zuzfakn");
	  click(By.xpath("//button[contains (text(),\"Log in \")]"));
	  click(By.xpath("//span[text()=\"Employees\"]"));
	  click(By.xpath("//ul[@id=\"admin_Employees\"]//a"));	  
	}
@Test
public void addEmp(){
	  click(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]"));
	  enterText(By.id("employee_id"), "71930853E");
	  enterText(By.id("first_name"), "j");
	  enterText(By.id("middle_name"), "ja");
	  enterText(By.id("last_name"), "jay");
	  enterText(By.id("rc_select_0"), "Indian");click(By.xpath("//div[@label=\"Indian\"]//div"));
	  enterText(By.id("birthday"), "2023-03-13");
	  enterText(By.id("rc_select_1"), "Male");click(By.xpath("//div[@label=\"Male\"]"));
	  enterText(By.id("rc_select_2"), "Single");click(By.xpath("//div[@label=\"Single\"]"));
	  enterText(By.id("rc_select_3"), "Asian");click(By.xpath("//div[@label=\"Asian American\"]"));
	  click(By.xpath("/html/body/div[13]/div/div[2]/div/div[2]/div[2]/div[5]/div/div[2]/div/div[2]/button/span"));
	  driver.close();
}
  }

