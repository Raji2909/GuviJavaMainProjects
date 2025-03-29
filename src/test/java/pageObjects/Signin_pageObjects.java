package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_pageObjects {
	@FindBy(xpath="//*[@id=\"signin2\"]")
	 public static WebElement signup;
	@FindBy(xpath="//*[@id=\"sign-username\"]")
	 public static WebElement username2;
	@FindBy(xpath="//*[@id=\"sign-password\"]")
	public static WebElement pass2;
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/button[2]")
	public static WebElement signinBtn;
}
