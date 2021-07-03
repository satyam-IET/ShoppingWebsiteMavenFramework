package test;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductSelection extends Baseclass {
	
	@Test
	public void testcase1() {
		
		LoginPage objLogin = new LoginPage();
		ProductPage objProduct = new ProductPage();
		CartPage objCart = new CartPage();
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		String Product = sheet.getRow(1).getCell(2).getStringCellValue();
		
		//User Login
		objLogin.login(uname, pass);
		
		//User adding product to cart
		objProduct.selectProduct(Product);
		
		// User clicking on go to cart icon
		objProduct.gotoCart();
		
		// User verifying cart product 
		
		objCart.verifycartProduct(Product);

		
	}

}
