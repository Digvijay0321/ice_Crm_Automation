package ice_hrm_Automation.copy;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTestICEHRM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","H:\\Automation Project\\ice_crm_Automation\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://icehrm.com/app/cybersuccess/login.php");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
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
		Thread.sleep(2000);
//employee page navigate..........		
       WebElement Emp = driver.findElement(By.xpath("//span[text()=\"Employees\"]"));Emp.click();
       Emp.findElement(By.xpath("//ul[@id=\"admin_Employees\"]//a")).click();
       String searchreasult = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary ant-input-search-button\"]")).getText();
       if(searchreasult.contains("Search")) {System.out.println("We are in Add emp option");}
       else {System.out.println("The Addemp option is not correct");}
       WebElement addemp = driver.findElement(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]"));addemp.click();
       String searchreasult1 = driver.findElement(By.xpath("//div[@id=\"rcDialogTitle0\"]")).getText();
       if(searchreasult1.contains("Employee")) {System.out.println("We are in Add emp page/option will be open");}
       else {System.out.println("The Addemployee  page is not correct");}
//fill all the details of emp required...........
      WebElement Empnum =driver.findElement(By.xpath("//input[@id=\"employee_id\"]"));Empnum.sendKeys("71930853E");
      WebElement Finame =driver.findElement(By.xpath("//input[@id=\"first_name\"]"));Finame.sendKeys("Digvijay");
      WebElement Miname =driver.findElement(By.xpath("//input[@id=\"middle_name\"]"));Miname.sendKeys("Dattatray");
      WebElement Laname =driver.findElement(By.xpath("//input[@id=\"last_name\"]"));Laname.sendKeys("Vasekar");
//Dropdown selected for Nationality.................................
      /*   WebElement Nationality =driver.findElement(By.xpath("//input[@id=\"rc_select_0\"] "));
      JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,200)", "");
      
      Nationality.click();
      Thread.sleep(3000);
      List<WebElement> Nationality1 = driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]/div"));
      //Thread.sleep(5000);
      List<WebElement> NationalityList = driver.findElements(By.xpath("//div[@class=\"ant-select-item ant-select-item-option\"]"));Thread.sleep(5000);
      
      for(int i = 0; i<NationalityList.size();i++) {
    	  WebElement element = NationalityList.get(i);
    	  String value = element.getText();
    	   {
    		  System.out.println(value);
    		  
    	  }
      }*/
       WebElement Gender =driver.findElement(By.xpath("//input[@id=\"rc_select_1\"] "));
      
       Gender.click();
      Thread.sleep(3000);
      List<WebElement> Genderlist = driver.findElements(By.xpath("//div[@class=\"ant-select-item ant-select-item-option\"]"));
    WebElement Female = driver.findElement(By.cssSelector("body > div:nth-child(20) > div > div > div > div.rc-virtual-list > div > div > div > div:nth-child(2)"));
      for(int i = 0; i<Genderlist.size();i++) {
    	  WebElement element = Genderlist.get(i);
    	  String value = element.getText();
    	   {
    		 System.out.println(value);
    		  if (value.equals("Female"))
    		  { Female.click();
      
	}
      }
	}
      driver.close();
}
}

