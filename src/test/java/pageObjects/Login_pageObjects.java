package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObjects {
	@FindBy(xpath="//*[@id=\"login2\"]")
	 public static WebElement Login;
	@FindBy(xpath="//*[@id=\"loginusername\"]")
	 public static WebElement username;
	@FindBy(xpath="//*[@id=\"loginpassword\"]")
	public static WebElement pass;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public static WebElement loginBtn;
	@FindBy(xpath="//*[@id=\"nameofuser\"]")
	public static WebElement nameofuser;
}
