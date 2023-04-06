package ice_hrm_Automation.copy;



import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	static WebDriver driver;
	public static void selectDayFromCalender(int featureDay) {
     driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
     List<WebElement> days= driver.findElements(By.xpath("//td[@class=\"current day\"]"));
     int currentDay = LocalDateTime.now().getDayOfMonth();
	 int dayToSelect = 	currentDay + featureDay;
		for(WebElement element : days) {
			String day = element.getText();
			String today = String.valueOf(dayToSelect);
			if(day.equals(today)) {
				element.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		selectDayFromCalender(28);
	}


}
