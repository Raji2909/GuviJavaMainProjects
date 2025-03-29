package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.Login_pageObjects;
public class Login_testCases {
	@Test
	public void login() {
			System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			PageFactory.initElements(driver, Login_pageObjects.class);
			Login_pageObjects.Login.click();
			Login_pageObjects.username.sendKeys("Holycross");
			Login_pageObjects.pass.sendKeys("12345");
			Login_pageObjects.loginBtn.click();
			Login_pageObjects.nameofuser.getText();
			System.out.println("Logged in successfully as Welcome Holycross");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logout2\"]")));element.click();
			System.out.println("Logged out successfully");
			}
}
