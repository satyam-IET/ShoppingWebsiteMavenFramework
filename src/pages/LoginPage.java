package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class LoginPage {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	// path for User Name
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement UserName;
	
	// path for Password
	
	@FindBy(xpath="//input[@id='password']")
	WebElement PassWord;
	
	// Path for Login
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement Login;
	
	public LoginPage() {
		
		driver = Baseclass.driver;
		reports = Baseclass.reports;
		test = Baseclass.test;
		PageFactory.initElements(driver , this);
	}
	
	public void login(String uname , String pass) {
		
		// Sending UserName 
		UserName.sendKeys(uname);
		
		// Sending Password
		PassWord.sendKeys(pass);
		
		// Clicking on Login Button
		Login.click();
		
		
	}

}
