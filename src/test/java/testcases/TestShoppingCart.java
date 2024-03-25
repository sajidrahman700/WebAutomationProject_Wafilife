package testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BooksDisplayPage;
import pages.CheckoutPage;
import pages.ShoppingCartPage;
import utilities.DriverSetup;



public class TestShoppingCart extends DriverSetup {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	BooksDisplayPage booksDisplayPage = new BooksDisplayPage();
	CheckoutPage checkOutPage = new CheckoutPage();

	
	@Test(dependsOnGroups = "order", description = "Verify that the shopping cart button is clickable", priority = 0)
	public void testShoppingCartButton() {
		shoppingCartPage.waitForElementToBeClickable(shoppingCartPage.shoppingCartButton);
		shoppingCartPage.clickOnElement(shoppingCartPage.shoppingCartButton);
		Assert.assertEquals(getBrowser().getTitle(), shoppingCartPage.shoppingCartTitle);
		
	}
	
	@Test(dependsOnMethods = "testShoppingCartButton", description = "Verify that the item in the shopping cart displays the correct information", priority = 1)
	public void testAddedProductTitle() {
		Assert.assertEquals(shoppingCartPage.displayAddProductName(1),"Chemistry - 1st Paper (Class XI-XII)");
		
	}
	
	@Test(dependsOnMethods = "testShoppingCartButton", description = "Verify that users can change the quantity of items in the cart", priority = 2)
	public void testUpdateQuantity() {
		shoppingCartPage.clearField(shoppingCartPage.quantityUpdate(1));
		shoppingCartPage.enterNumberOnAElement(shoppingCartPage.quantityUpdate(1), 2);
		shoppingCartPage.waitForElementToBeClickable(shoppingCartPage.quantityUpdate(1));
		Assert.assertEquals(shoppingCartPage.getAttributeValue(shoppingCartPage.quantityUpdate(1),"value"),"2");
	}
	
	@Test(dependsOnMethods = "testUpdateQuantity", description = "Verify that the total price is updated accordingly", priority = 3)
	public void testUpdatedTotalPrice() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(shoppingCartPage.getElementText(shoppingCartPage.displayAddProductPrice(1)),"1,160 ৳");
				
	}
	
	@Test(dependsOnMethods = "testUpdatedTotalPrice", groups = "ShoppingCart", description = "Verify that open a checkout page after clicking the Complete the order button", priority = 4)
	public void testCompleteTheOrderButton() {
		shoppingCartPage.clickOnElement(shoppingCartPage.completeOrderButon);
		Assert.assertEquals(getBrowser().getTitle(),checkOutPage.checkoutPageTitle);
		
	}

}
