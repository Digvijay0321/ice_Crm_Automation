package Pages;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass1;

public class MyInfoPage extends BaseClass1 {

	public By myInfoMenue = By.xpath("//span[text()='My Info']");
	public By profileImg  = By.xpath("//img[@class='employee-image']");
	public By addImg = By.xpath("//i[@class='oxd-icon bi-plus']");
	public By saveButton = By.xpath("//button[@type='submit']");
	
}
