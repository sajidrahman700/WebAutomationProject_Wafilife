package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{
	
	public By emergencyNumberInputField = By.xpath("//input[@id='billing_alternative_phone']");
	public By selectDistrict =By.xpath("//span/select[@name='billing_state']");
	public By selectUpazila = By.xpath("//select[@id='billing_area']");
	public By addressInpputField = By.xpath("//textarea[@id='billing_address_1']");
	public By otherInformatioinInputField =By.xpath("//textarea[@id='order_comments']");
	public By cashOnDeliveryOption = By.xpath("//input[@id='payment_method_cod']");

}
