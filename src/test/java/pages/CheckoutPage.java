package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{
	
	public String checkoutPageTitle="Checkout";
	
	public By emergencyNumberInputField = By.xpath("//input[@id='billing_alternative_phone']");
	public By selectDistrict =By.xpath("//span[@id='select2-billing_state-container']");
	public By selectUpazila = By.xpath("//select[@id='billing_area']");
	public By addressInpputField = By.xpath("//textarea[@id='billing_address_1']");
	public By otherInformatioinInputField =By.xpath("//textarea[@id='order_comments']");
	public By cashOnDeliveryOption = By.xpath("//li[@class='payment_method_cod']");
	public By cashOndeliverySelectMsg = By.xpath("//p[contains(text(),'পণ্য ডেলিভারির পরে নগদ টাকা দিতে হবে।')]");

}
