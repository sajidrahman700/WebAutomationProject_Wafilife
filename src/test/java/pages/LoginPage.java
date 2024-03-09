package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;

public class LoginPage extends BasePage{
	
    public String loginPageTitle = "আমার অ্যাকাউন্ট";
    public String loginPageURL = "https://www.wafilife.com/my-account";
	public By userNameInputField = By.xpath("//input[@id='username']");
	public By passwordInputField = By.xpath("//input[@id='password']");
	public By loginButton = By.xpath("//input[@name='login']");
	
	public String usernameEmptyErrorMessage = "Error: ইউজার নাম প্রয়োজন";
	public String usernameincorrectErrorMessage = "Unknown email address. Check again or try your username.";
	public String passwordEmptyErrorMessage = "Error: The password field is empty.";
	public String passwordIncorrectErrorMessage = "Error: The password you entered for the email address tutt@gh.com is incorrect. Lost your password?";
	
	public By errorMessageField = By.xpath("//ul[@class='woocommerce-error']/li");
	
	
	@Step("Verify Login with userName {0} and password {1}")
    public void doLogin(String userName, String password) {
		
		loadAWebPage(loginPageURL);
		enterUserName(userName);
		enterPassword(password);
		clickOnElement(loginButton);
		
	}

	@Step("Enter username {0}")
	public void enterUserName(String userName) {
		if (getElement(userNameInputField).isDisplayed())
			writeOnAElement(userNameInputField, userName);
	}

	@Step("Enter password {0}")
	public void enterPassword(String password) {
		if (getElement(passwordInputField).isDisplayed())
			writeOnAElement(passwordInputField, password);
	}
    
    

}
