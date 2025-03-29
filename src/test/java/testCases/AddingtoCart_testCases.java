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
import pageObjects.AddingtoCart_pageObjects;
public class AddingtoCart_testCases {
	@Test
	public void Cart() {
		System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/");
		PageFactory.initElements(driver,AddingtoCart_pageObjects.class);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/a/img")));element.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        AddingtoCart_pageObjects.Productinfo.isDisplayed();
	    System.out.println("Product info are displayed");
	    AddingtoCart_pageObjects.Cart.click();
	    AddingtoCart_pageObjects.Cart.click();
	    AddingtoCart_pageObjects.CartBtn.click();
	    AddingtoCart_pageObjects.CartPage.getText();
	    System.out.println("Product count increments in the cart");
	    AddingtoCart_pageObjects.DeleteItem.click();
	    System.out.println("Total price after modification is Rs.360 and it's reflected in the UI");
	    AddingtoCart_pageObjects.PlaceOrder.click();
	    AddingtoCart_pageObjects.Name.sendKeys("Holycross");
	    AddingtoCart_pageObjects.Country.sendKeys("India");
	    AddingtoCart_pageObjects.City.sendKeys("Trichy");
	    AddingtoCart_pageObjects.CreditCard.sendKeys("12345678");
	    AddingtoCart_pageObjects.Month.sendKeys("March");
	    AddingtoCart_pageObjects.Year.sendKeys("2026");
	    AddingtoCart_pageObjects.PurchaseBtn.click();
	    System.out.println("Successfully purchased Amount: 360 USD");
}
}
