package ice_hrm_Automation.copy;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String parentWindowId = driver.getWindowHandle();
		System.out.println("First Tab Id:"+parentWindowId);
		Thread.sleep(8000);
//open new tab.............
		WebElement prime = driver.findElement(By.xpath("//div[@id=\"navSwmHoliday\"]/a"));prime.click();
		Set<String> allIds = driver.getWindowHandles();
//print all links of current tab.......
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0; i<list.size();i++)
		{WebElement element = list.get(i);
	    String url = element.getAttribute("href");
		System.out.println(url);}
		System.out.println("Print all Window Ids");//get all window id ....
		for (String id : allIds) {
			if(!id.equals(parentWindowId)) {
				System.out.println("Second Tab Id:"+id);
				driver.switchTo().window(id);//switch the contron to first tab.......
				String secondTabTitle = driver.getTitle();//get title of second window ........
				System.out.println("Second Tab Title:"+secondTabTitle);
				driver.close();//close second tab.........
			}		
		}
		driver.switchTo().window(parentWindowId);
		String firstTabTitle = driver.getTitle();
		System.out.println("First tab Title"+firstTabTitle);
		driver.quit();	
	}
	}

