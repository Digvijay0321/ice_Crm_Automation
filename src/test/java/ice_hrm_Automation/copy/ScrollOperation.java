package ice_hrm_Automation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		//WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		//Actions actions = new Actions(driver);
        //actions.moveToElement( driver.findElement(By.xpath("//button[@type=\"button\"]"))).build().perform();
		actions.click( driver.findElement(By.xpath("//button[@type=\"button\"]"))).build().perform();
		//actions.contextClick().build().perform();
		//actions.contextClick( driver.findElement(By.xpath("//button[@type=\"button\"]"))).build().perform();*/
		
//Drag and Drop operation..................		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capitals = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
		WebElement world = driver.findElement(By.xpath("//div[@id=\"box101\"]"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(capitals).release(world).build().perform();
		actions.dragAndDrop(capitals, world).build().perform();


		
		
	}

}
