package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
	
	public String registerPageTitle = "আমার অ্যাকাউন্ট";
	public String registerPageURL = "https://www.wafilife.com/my-account";
	
	public By nameInputField = By.xpath("//input[@id='reg_billing_first_name']");
	public By phonenumberInputField = By.xpath("//input[@id='reg_billing_phone']");
	public By emailInputField = By.xpath("//input[@id='reg_email']");
	public By passwordInputField = By.xpath("//input[@id='reg_password']");
	public By confirmPasswordInputField = By.xpath("//input[@id='reg_confirm_password']");
	public By registerButton = By.xpath("//input[@name='register']");
	
	public String nameErrorMessage = "Error: নাম প্রয়োজন!";
	public String phoneNumberErrorMessage = "Error: Error: ফোন নাম্বার প্রয়োজন!.";
	public String emailErrorMessage = "Error: অনুগ্রহ করে সঠিক ইমেইল প্রদান করুন";
	public String passwordErrorMessage = "Error: অনুগ্রহ করে আপনার পাসওয়ার্ড প্রদান করুন";
	public String confirmPassworderrorMessage = "Error: পাসওয়ার্ড মিলতেছে না";
	public String alreadyUsedEmailErrorMessage = "Error: এই ইমেইল অ্যাড্রেস দিয়ে ইতিমধ্যে একটি অ্যাকাউন্ট খোলা হয়েছে। অনুগ্রহ করে নতুন ইমেইল অ্যাড্রেস ব্যবহার করুন অথবা লগইন করুন";
	
	
	public By errorMessageField = By.xpath("//ul[@class='woocommerce-error']/li");
	
	
 
}
