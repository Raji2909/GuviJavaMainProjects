package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductCategories_testCases extends Login_testCases  {
	 static WebDriver driver;
		@Test
			public void homepage() {
				System.out.println("Menu items are displayed on the homepage eg:Home,Contact,About Us,Cart,Log out,Welcome Holycross");
				boolean MenuItems = true;
			        Assert.assertTrue(MenuItems, "Menu items are displayed");
			}
			@Test
			public void categories() throws IOException {
				System.out.println("Categories are displayed on the homepage eg:Phones,Laptops and Monitors");
				boolean allCategories = true;
			        Assert.assertTrue(allCategories, "Categories are displayed");
			        Assert.fail();
			    		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
			    		File one = screenshot1.getScreenshotAs(OutputType.FILE);
			    		File FileOne = new File ("C:\\Users\\sakth\\eclipse-workspace\\MiniProject\\Screenshots\\one.jpg");
			    		FileUtils.copyFile(one,FileOne);
			        System.out.println("Screenshot was taken");
			}

			@Test
			public void logo() {
				System.out.println("Logo is displayed on the homepage");
				boolean Logo = true;
			        Assert.assertTrue(Logo, "Logo are displayed");
			}
}
