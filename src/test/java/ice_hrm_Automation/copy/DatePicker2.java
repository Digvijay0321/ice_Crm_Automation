package ice_hrm_Automation.copy;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.cheome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//navigate to url.........................................
		driver.navigate().to("https://icehrm.com/app/cybersuccess/login.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		loginbutton.click();
		Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[text()=\"Employees\"]")).click();
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//ul[@id=\"admin_Employees\"]//a")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]")).click();
//add the values.............................................
	        WebElement Empnum =driver.findElement(By.xpath("//input[@id=\"employee_id\"]"));Empnum.sendKeys("71930853E");
	        WebElement Finame =driver.findElement(By.xpath("//input[@id=\"first_name\"]"));Finame.sendKeys("Digvijay");
	        WebElement Miname =driver.findElement(By.xpath("//input[@id=\"middle_name\"]"));Miname.sendKeys("Dattatray");
	        WebElement Laname =driver.findElement(By.xpath("//input[@id=\"last_name\"]"));Laname.sendKeys("Vasekar");
//Date select from table......................................
	        int currentDay = LocalDateTime.now().getDayOfMonth();
	        Thread.sleep(2000);
	        driver.findElement(By.id("birthday")).click();
	      List<WebElement> days = driver.findElements(By.xpath("//td[contains(@class, ant-picker-cell-in-view)]/div"));
	      for(WebElement element : days) {
	    	  String day=element.getText();
	    	  String today= String.valueOf(currentDay);
	    	  if(day.equals(today)) {
	    		  element.click();
	    	  }
	      }
		
	}

}
