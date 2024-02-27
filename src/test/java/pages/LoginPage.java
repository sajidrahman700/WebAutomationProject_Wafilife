package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
public String loginPageTitle = "আমার অ্যাকাউন্ট";
	
	public By userNameInputField = By.xpath("//input[@id='reg_billing_first_name']");
	public By passwordInputField = By.xpath("//input[@id='reg_billing_phone']");
	public By loginButton = By.xpath("//input[@name='login']");
	
	public String usernameErrorMessage = " ইউজার নাম প্রয়োজন";
	public String passwordErrorMessage = " The password field is empty.";
	
	public By errorMessageField = By.xpath("//ul[@class='woocommerce-error']/li");

}
