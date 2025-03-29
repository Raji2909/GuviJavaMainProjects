package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingtoCart_pageObjects {
	 @FindBy(xpath="//*[@id=\"tbodyid\"]")
	 public static WebElement Productinfo;
	 @FindBy(xpath="/html/body/nav/div/div/ul/li[1]/a")
	 public static WebElement Home;
	 @FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/div/a")
	 public static WebElement Cart;
	@FindBy(xpath="//*[@id=\"cartur\"]")
	 public static WebElement CartBtn;
	@FindBy(xpath="/html/body/div[6]/div/div[1]")
	 public static WebElement CartPage;
	@FindBy(xpath="/html/body/div[6]/div/div[1]/div/table/tbody/tr[1]/td[4]/a")
	 public static WebElement DeleteItem;
	@FindBy(xpath="/html/body/div[6]/div/div[2]/button")
	 public static WebElement PlaceOrder;
	@FindBy(xpath="//*[@id=\"name\"]")
	 public static WebElement Name;
	@FindBy(xpath="//*[@id=\"country\"]")
	 public static WebElement Country;
	@FindBy(xpath="//*[@id=\"city\"]")
	 public static WebElement City;
	@FindBy(xpath="//*[@id=\"card\"]")
	 public static WebElement CreditCard;
	@FindBy(xpath="//*[@id=\"month\"]")
	 public static WebElement Month;
	@FindBy(xpath="//*[@id=\"year\"]")
	 public static WebElement Year;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
	 public static WebElement PurchaseBtn;
}
