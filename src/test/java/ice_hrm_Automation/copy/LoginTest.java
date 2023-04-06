package ice_hrm_Automation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         Thread.sleep(5000);
//Login to the application.......................... 
         WebElement id = driver.findElement(By.name("username"));
        id.sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(5000);
       WebElement dashboardtext = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
        String dashboardtxt = dashboardtext.getText();
        System.out.println(dashboardtxt); 
        if(dashboardtxt.contains("Dashboard")) {  
        	System.out.println("Login Successful");
        }else {
        	System.out.println("Failed to login");
        	} 
        Thread.sleep(5000);
//locate the pim module.......................
        WebElement pim = driver.findElement(By.xpath("//span[text()=\"PIM\"]"));pim.click();
        Thread.sleep(5000);
        WebElement searchbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
       if(searchbutton.isDisplayed()) {
    	   System.out.println("Successful able to find search button");
       }else { System.out.println("Unable to find search button");
       }
        driver.close();

	}
}
