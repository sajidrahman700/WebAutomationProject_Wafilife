package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BooksDisplayPage;
import pages.ShoppingCartPage;
import utilities.DriverSetup;

public class TestOrder extends DriverSetup{
	BooksDisplayPage booksDisplayPage = new BooksDisplayPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	
	@Test
	public void testOrderButton() {
		booksDisplayPage.loadAWebPage("https://www.wafilife.com/%e0%a6%95%e0%a7%87%e0%a6%ae%e0%a6%bf%e0%a6%b8%e0%a7%8d%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%bf-%e0%a7%a7%e0%a6%ae-%e0%a6%aa%e0%a6%a4%e0%a7%8d%e0%a6%b0-%e0%a6%8f%e0%a6%95%e0%a6%be%e0%a6%a6%e0%a6%b6/dp/434536");
		Assert.assertTrue(booksDisplayPage.getElement(booksDisplayPage.orderButton).isEnabled());

		
	}
	@Test
	public void testProductAddedToCart() {
		booksDisplayPage.loadAWebPage("https://www.wafilife.com/%e0%a6%95%e0%a7%87%e0%a6%ae%e0%a6%bf%e0%a6%b8%e0%a7%8d%e0%a6%9f%e0%a7%8d%e0%a6%b0%e0%a6%bf-%e0%a7%a7%e0%a6%ae-%e0%a6%aa%e0%a6%a4%e0%a7%8d%e0%a6%b0-%e0%a6%8f%e0%a6%95%e0%a6%be%e0%a6%a6%e0%a6%b6/dp/434536");
		booksDisplayPage.clickOnElement(booksDisplayPage.orderButton);
		shoppingCartPage.waitForVisibilityOfElement(shoppingCartPage.productAddedMsg);
		Assert.assertTrue(shoppingCartPage.getElement(shoppingCartPage.productAddedMsg).isDisplayed());
	}
	
	

}
