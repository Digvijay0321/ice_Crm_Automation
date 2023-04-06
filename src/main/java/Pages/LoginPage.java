package Pages;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass1;

public class LoginPage extends BaseClass1{
  
	// Declare all the locators
    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[contains(text(), 'Log in')]");
    By restPasswordLink = By.xpath("//a[contains(text(),'Reset Password')]");
    public By errorMsg = By.xpath("//div[contains(@class, 'alert-danger')]");

    public void login(String username, String password){
        enterText(this.username, username);
        enterText(this.password, password);
        click(loginButton);
    }
    //Reusable methods for login module
}


