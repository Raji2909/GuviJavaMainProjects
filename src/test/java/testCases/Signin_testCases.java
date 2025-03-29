package testCases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Signin_pageObjects;
public class Signin_testCases {
	@BeforeMethod
	@Test
	public void signin() {
    System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox");
    WebDriver driver = new FirefoxDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	PageFactory.initElements(driver, Signin_pageObjects.class);
	Signin_pageObjects.signup.click();
	Signin_pageObjects.username2.sendKeys("Holycross");
	Signin_pageObjects.pass2.sendKeys("12345");
	Signin_pageObjects.signinBtn.click();
	System.out.println("Sign Up Successfully");
}
}
