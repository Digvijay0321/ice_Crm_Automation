package ice_hrm_Automation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeopDownTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","H:\\Automation Project\\ice_crm_Automation\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://icehrm.com/app/cybersuccess/login.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
//Verify login feature witn valid username and password...................
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		loginbutton.click();
		String hometext = driver.findElement(By.xpath("//header[@id=\"delegationDiv\"]/a")).getText();
		System.out.println(hometext);
		if(hometext.equals("Home")){ System.out.println("Successful Login");} 
		else {System.out.println("Failed to login");
       throw new Exception("Failed to login");
        }
		Thread.sleep(5000);
//employee page navigate..........		
       WebElement Emp = driver.findElement(By.xpath("//span[text()=\"Employees\"]"));Emp.click();
       Emp.findElement(By.xpath("//ul[@id=\"admin_Employees\"]//a")).click();
       String searchreasult = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary ant-input-search-button\"]")).getText();
      if(searchreasult.contains("Search")) {System.out.println("We are in Add emp option");}
     else {System.out.println("The Addemp option is not correct");}
      WebElement addemp = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]"));addemp.click();
 //employee details page open or not.........
      String searchreasult1 = driver.findElement(By.xpath("//div[@id=\"rcDialogTitle0\"]")).getText();
      if(searchreasult1.contains("Employee")) {System.out.println("We are in Add emp page/option will be open");}
     else {System.out.println("The Addemployee  page is not correct");}
//fill all the details of emp required...........
      WebElement Empnum =driver.findElement(By.xpath("//input[@id=\"employee_id\"]"));Empnum.sendKeys("71930853E");
      WebElement Finame =driver.findElement(By.xpath("//input[@id=\"first_name\"]"));Finame.sendKeys("Digvijay");
      WebElement Miname =driver.findElement(By.xpath("//input[@id=\"middle_name\"]"));Miname.sendKeys("Dattatray");
      WebElement Laname =driver.findElement(By.xpath("//input[@id=\"last_name\"]"));Laname.sendKeys("Vasekar");
//gender selected from dropdown................
       WebElement Gender =driver.findElement(By.xpath("//input[@id=\"rc_select_1\"]"));Gender.click();
       Gender.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2000);
       Gender.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
//Maritalstatus Dropdown.......................
       WebElement Maritalstatus =driver.findElement(By.xpath("//input[@id=\"rc_select_2\"]"));Maritalstatus.click();
       Maritalstatus.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2000);
       Maritalstatus.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
//Dropdown nationality.....................
      WebElement Nationality =driver.findElement(By.xpath("//input[@id=\"rc_select_0\"] "));Nationality.click();
      Nationality.sendKeys(Keys.ARROW_DOWN);
      Thread.sleep(2000);
      Nationality.sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      WebElement savebutton = driver.findElement(By.xpath("//span[text()=\"Save\"]"));savebutton.click();
       driver.close();
	}
}
