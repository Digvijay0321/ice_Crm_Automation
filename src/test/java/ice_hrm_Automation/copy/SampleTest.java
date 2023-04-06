package ice_hrm_Automation.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws Exception 
	{

System.setProperty("webdriver.chrome.driver","H:\\Automation Project\\ice_crm_Automation\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://icehrm.com/app/cybersuccess/login.php");
		
//Verify login feature witn valid username and password...................
		//driver.navigate().to("https://icehrm-open.gamonoid.com/login.php	");
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
	   
//Verify login feature witn invalid username and password...................
		/*WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jay");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Vasekar");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		loginbutton.click();
		String hometext = driver.findElement(By.xpath("//header[@id=\"delegationDiv\"]/a")).getText();
		System.out.println(hometext);
		if(hometext.equals("Home")) { System.out.println("Successful Login");}
		else {System.out.println("Failed to login");
		throw new Exception("Failed to login");
		}*/
//Verify login feature witn valid username and invalid password...................
		/*WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Vasekar");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
		loginbutton.click();
		String hometext = driver.findElement(By.xpath("//header[@id=\"delegationDiv\"]/a")).getText();
		System.out.println(hometext);
		if(hometext.equals("Home")){ System.out.println("Successful Login");} 
		else {System.out.println("Failed to login");
       throw new Exception("Failed to login");
		}*/
//Verify login feature witn invalid username and valid password...................
				/*WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("Jay");
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("admin");
				WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
				loginbutton.click();
				String hometext = driver.findElement(By.xpath("//header[@id=\"delegationDiv\"]/a")).getText();
				System.out.println(hometext);
				if(hometext.equals("Home")){ System.out.println("Successful Login");} 
				else {System.out.println("Failed to login");
		       throw new Exception("Failed to login");
				}
	driver.close();*/
	
}
}


