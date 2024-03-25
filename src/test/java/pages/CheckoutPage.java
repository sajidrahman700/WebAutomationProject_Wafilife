package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{
	
	public String checkoutPageTitle="Checkout";
	
	public By emergencyNumberInputField = By.xpath("//input[@id='billing_alternative_phone']");
	public By selectDistrict =By.xpath("//span[@id='select2-billing_state-container']");
	public By selectUpazila = By.xpath("//select[@id='billing_area']");
	public By addressInpputField = By.xpath("//textarea[@id='billing_address_1']");
	public By otherInformatioinInputField =By.xpath("//textarea[@id='order_comments']");
	public By bkashOption = By.xpath("//input[@id='payment_method_bkash']");
	public By bkashSelectMsg = By.xpath("//div/ul[@class=\"payment_methods methods\"]/li[2]/div/p");
	
	public void ChoseDistrict(String name) {
		
		By element = By.xpath("//span/ul/li[contains(text(),'"+name+"')]");
    	scrollToAElement(element);
    	waitForElementToBeClickable(element);
		clickOnElement(element);
	
	}

}
