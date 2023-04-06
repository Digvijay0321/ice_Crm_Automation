package ice_hrm_Automation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperation {

	public static void main(String[] args) throws Exception   {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
	Select select = new Select(searchDropDown);
	//select.selectByVisibleText("Electronics");
	//select.selectByValue("value=\"search-alias=electronics\"");
	select.selectByIndex(16);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Keyboard");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(7000);
	String searchreasult = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
	if(searchreasult.contains("Keyboard")) {
		System.out.println("Search Reasult is correct");	
	} else { System.out.println("Search Reasult is not correct");
	
	}
driver.close();	
	}

}
