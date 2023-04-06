package ice_hrm_Automation.copy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class AmazonLinksCheck {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0; i<list.size();i++)
		{WebElement element = list.get(i);
		 	String url = element.getAttribute("href");
		 	System.out.println(url);
		 	if (url!= null && !url.equals("javascript: void(0)")) {
		 		try {
		 		URL uri = new URL(url);
		 		URLConnection urlConnection = uri.openConnection();
		 		HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
		 		httpURLConnection.connect();
		 		int statusCode = httpURLConnection.getResponseCode();
		 		if(statusCode >= 300) {
		 			System.out.println("Broken url;"+"Status code:"+statusCode +"url:"+uri);
		 		}
		 		httpURLConnection.disconnect();
		 	} catch(Exception ignored){	
		 	}
			
		}
	}
driver.close();
}
}
