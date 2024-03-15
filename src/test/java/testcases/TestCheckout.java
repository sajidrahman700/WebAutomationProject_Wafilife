package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import utilities.DriverSetup;

public class TestCheckout extends DriverSetup{
	CheckoutPage checkOutPage = new CheckoutPage();
	
	@Test(dependsOnGroups  = "ShoppingCart")
	public void testEmergencyPhoneNumberField() {
		checkOutPage.writeOnAElement(checkOutPage.emergencyNumberInputField,"01200000000");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());

	}
	
	@Test(dependsOnGroups  = "ShoppingCart")
	public void testSelectDistrict() {
		checkOutPage.hoverOnElement(checkOutPage.selectDistrict);
		//Assert.assertEquals(checkOutPage.getSelectOptionText(checkOutPage.selectDistrict),"Dhaka");
		
	}
	
	@Test(dependsOnMethods  = "testSelectDistrict")
	public void testSelectUpazila() {
		checkOutPage.selectDropdownByIndex(checkOutPage.selectUpazila, 33);
		Assert.assertEquals(checkOutPage.getSelectOptionText(checkOutPage.selectUpazila),"জিগাতলা");
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart")
	public void testAddressField() {
		checkOutPage.writeOnAElement(checkOutPage.addressInpputField,"Dhanmondi");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart")
	public void testOtherInformationField() {
		checkOutPage.writeOnAElement(checkOutPage.otherInformatioinInputField,"Hello");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart")
	public void testSelectPaymentOption() {
		checkOutPage.clickOnElement(checkOutPage.cashOnDeliveryOption);
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.cashOndeliverySelectMsg).isDisplayed());
		
	}
	
	

}
