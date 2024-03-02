package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;

import pages.HeaderPage;
import pages.HomePage;
import pages.RegisterPage;
import utilities.DriverSetup;

public class TestRegister extends DriverSetup {
	
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	RegisterPage registerPage = new RegisterPage();
	
	public void testRegister(String Name, String Number, String Email, String Password, String ConfirmPassword, String SsName, By locator, String displayErrorMsg ) {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
	
		registerPage.writeOnAElement(registerPage.confirmPasswordInputField,Name);
		registerPage.writeOnAElement(registerPage.phonenumberInputField, Number);
		registerPage.writeOnAElement(registerPage.emailInputField, Email);
		registerPage.writeOnAElement(registerPage.passwordInputField, Password);
		registerPage.writeOnAElement(registerPage.confirmPasswordInputField, ConfirmPassword);
		registerPage.clickOnElement(registerPage.registerButton);
		registerPage.takeScreenShot("SsName");
		Assert.assertTrue(registerPage.getElement(locator).isDisplayed());
		Assert.assertEquals(registerPage.getElementText(locator), displayErrorMsg );
		
		
	}
	

}
