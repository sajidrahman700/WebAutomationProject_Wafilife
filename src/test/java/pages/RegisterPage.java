package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
	
	public String registerPageTitle = "আমার অ্যাকাউন্ট";
	
	public By nameInputField = By.xpath("//input[@id='reg_billing_first_name']");
	public By phonenumberInputField = By.xpath("//input[@id='reg_billing_phone']");
	public By emailInputField = By.xpath("//input[@id='reg_email']");
	public By passwordInputField = By.xpath("//input[@id='reg_password']");
	public By confirmPasswordInputField = By.xpath("//input[@id='reg_confirm_password']");
	public By registerButton = By.xpath("//input[@name='register']");
	
	public String nameErrorMessage = " নাম প্রয়োজন!";
	public String phoneNumberErrorMessage = ": ফোন নাম্বার প্রয়োজন!.";
	public String emailErrorMessage = " অনুগ্রহ করে সঠিক ইমেইল প্রদান করুন";
	public String passwordErrorMessage = " অনুগ্রহ করে আপনার পাসওয়ার্ড প্রদান করুন";
	public String confirmPassworderrorMessage = " পাসওয়ার্ড মিলতেছে না";
	
	public By errorMessageField = By.xpath("//ul[@class='woocommerce-error']/li");
	

}
