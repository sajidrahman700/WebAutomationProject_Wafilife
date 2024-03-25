package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import utilities.DriverSetup;

public class TestCheckout extends DriverSetup{
	CheckoutPage checkOutPage = new CheckoutPage();
	
	@Test(dependsOnGroups  = "ShoppingCart", priority = 0, description = "Verify that the user can write in the Emergency phone number field")
	public void testEmergencyPhoneNumberField() {
		checkOutPage.writeOnAElement(checkOutPage.emergencyNumberInputField,"01700000029");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());

	}
	
	@Test(dependsOnGroups  = "ShoppingCart", priority = 1, description = "Verify that the user can select a district")
	public void testSelectDistrict() {
		checkOutPage.clickOnElement(checkOutPage.selectDistrict);
		checkOutPage.ChoseDistrict("Sylhet");
		Assert.assertEquals(checkOutPage.getElementText(checkOutPage.selectDistrict),"Sylhet");
		
	}
	
	@Test(dependsOnMethods = "testSelectDistrict", priority = 2, description = "Verify that the user can select an area or Upazila")
	public void testSelectUpazila() {
		checkOutPage.waitForElementToBeClickable(checkOutPage.selectUpazila);
		checkOutPage.selectDropdownByText(checkOutPage.selectUpazila, "দক্ষিণ সুরমা");
		Assert.assertEquals(checkOutPage.getSelectOptionText(checkOutPage.selectUpazila),"দক্ষিণ সুরমা");
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart",priority = 3, description = "Verify that the user can write the full address in the Address field")
	public void testAddressField() {
		checkOutPage.writeOnAElement(checkOutPage.addressInpputField,"Sylhet");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart",priority = 4, description = "Verify that the user can write in the Other information field")
	public void testOtherInformationField() {
		checkOutPage.writeOnAElement(checkOutPage.otherInformatioinInputField,"Hello");
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.emergencyNumberInputField).isEnabled());
		
	}
	
	@Test(dependsOnGroups  = "ShoppingCart", priority = 5, description = "Verify that the user can select a payment option",groups = "checkout")
	public void testSelectPaymentOption() throws InterruptedException {
		Thread.sleep(2000);
		//checkOutPage.waitForElementToBeClickable(checkOutPage.bkashOption);
		checkOutPage.clickOnElement(checkOutPage.bkashOption);
		Assert.assertTrue(checkOutPage.getElement(checkOutPage.bkashSelectMsg).isDisplayed());
		
	}
	
	

}
