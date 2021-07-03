package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class ProductPage {
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	// Add to cart path
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']")
	WebElement AddtoCart;
	
	// Go to cart path
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement GotoCart;
	
	public ProductPage() {
		
		driver = Baseclass.driver;
		reports = Baseclass.reports;
		test = Baseclass.test;
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct(String Product) {
		
		// Created Dynamic path and clicking on add to cart
		WebElement productselection = driver.findElement(By.xpath("//*[text()='" + Product + "']//following::button[1]"));
		productselection.click();
	}
	
	public void gotoCart() {
		// Clicking on go to cart
		GotoCart.click();
	}
	
}