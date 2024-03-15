package testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BooksDisplayPage;
import pages.ShoppingCartPage;
import utilities.DriverSetup;



public class TestShoppingCart extends DriverSetup {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	BooksDisplayPage booksDisplayPage = new BooksDisplayPage();
	
	@Test(dependsOnGroups = "order")
	public void testShoppingCartButton() {
		shoppingCartPage.waitForElementToBeClickable(shoppingCartPage.shoppingCartButton);
		shoppingCartPage.clickOnElement(shoppingCartPage.shoppingCartButton);
		Assert.assertEquals(getBrowser().getTitle(), shoppingCartPage.shoppingCartTitle);
		
	}
	
	@Test(dependsOnMethods = "testShoppingCartButton")
	public void testAddedProductTitle() {
		Assert.assertEquals(shoppingCartPage.displayAddProductName(1),"Chemistry - 1st Paper (Class XI-XII)");
		
	}
	
	@Test(dependsOnMethods = "testShoppingCartButton")
	public void testUpdateQuantity() {
		shoppingCartPage.clearField(shoppingCartPage.quantityUpdate(1));
		shoppingCartPage.enterNumberOnAElement(shoppingCartPage.quantityUpdate(1), 2);
		shoppingCartPage.waitForElementToBeClickable(shoppingCartPage.quantityUpdate(1));
		Assert.assertEquals(shoppingCartPage.getAttributeValue(shoppingCartPage.quantityUpdate(1),"value"),"2");
	}
	
	@Test(dependsOnMethods = "testUpdateQuantity")
	public void testUpdatedTotalPrice() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(shoppingCartPage.getElementText(shoppingCartPage.displayAddProductPrice(1)),"1,160 ৳");
				
	}
	
	@Test(dependsOnMethods = "testUpdatedTotalPrice")
	public void testCompleteTheOrderButton() {
		shoppingCartPage.clickOnElement(shoppingCartPage.completeOrderButon);
		
		
	}

}
