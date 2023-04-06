package ice_hrm_Automation.copy;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonprize {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");Thread.sleep(2000);
		WebElement searchdropdown = driver.findElement(By.id("searchDropdownBox"));searchdropdown.click();
		Select select = new Select(searchdropdown);
		select.selectByValue("search-alias=electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		int totalResult;
		List<WebElement> mobileresults=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget, 'search_result_')]/descendant::h2//span"));
		totalResult = mobileresults.size();
		System.out.println("Total Result: "+totalResult);
		for(int i=3; i <= totalResult ;i++ ) {
			try {
				String nameXpath = "//div[starts-with(@data-cel-widget, 'search_result_')]["+i+"]/descendant::h2//span";
				//System.out.println(nameXpath);
				String priceXpath = "//div[starts-with(@data-cel-widget, 'search_result_')]["+i+"]/descendant::span[@class=\"a-price-whole\"]";
			     String mobilename = driver.findElement(By.xpath(nameXpath)).getText();
			     String mobileprice = driver.findElement(By.xpath(priceXpath)).getText();
			     String strPrice = mobileprice.replace(",","");
			     Integer mobilevalue = Integer.valueOf(strPrice);
			     if(mobilevalue>=10000) {
			    	 System.out.println("price :"+mobileprice  +  "Name :"+mobilename);
			     }
			     
			} catch(Exception e) {
						//System.out.println(e.getMessage());}
			}
		}
		driver.close();
	}

	}
