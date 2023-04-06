package OrangeHrm_Automation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 	
import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;

import Pages.MyInfoPage;
import Pages.OrangeHrmLoginPage;


public class FileUploadTest extends BaseClass1 {
	
  OrangeHrmLoginPage  orangeHrmLoginPage;
  MyInfoPage  myInfoPage;
  PropertyHandling property;
  
   @BeforeClass
  public void beforClass() {
         orangeHrmLoginPage = new OrangeHrmLoginPage();
         myInfoPage = new MyInfoPage();
         property = new PropertyHandling();
         String username = property.getProperties("orangeHrmUsername");
         String password = property.getProperties("orangeHrmPassword"); 
         String browser = property.getProperties("browser");
         String url = property.getProperties ("orangeHrmUrl");
         launchBrowser (browser);
         driver.get(url);
         orangeHrmLoginPage.login(username, password);
   }
   
  @Test
   public void fileUpload() {
  click(myInfoPage.myInfoMenue);
  click(myInfoPage.profileImg);
  click(myInfoPage.addImg); 
  this.fileUpload("H:\\img\\photo.PNG");
}
}
