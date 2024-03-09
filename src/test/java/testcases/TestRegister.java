package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderPage;
import pages.HomePage;
import pages.RegisterPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestRegister extends DriverSetup {
	
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	RegisterPage registerPage = new RegisterPage();
	
	@Test
	public void testRegisterPagetitle() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertEquals(getBrowser().getTitle(),registerPage.registerPageTitle);	
	}
	
	@Test
	public void testInputFieldIsPresent() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(registerPage.getElement(registerPage.nameInputField).isEnabled());
		Assert.assertTrue(registerPage.getElement(registerPage.phonenumberInputField).isEnabled());
		Assert.assertTrue(registerPage.getElement(registerPage.emailInputField).isEnabled());
		Assert.assertTrue(registerPage.getElement(registerPage.passwordInputField).isEnabled());
		Assert.assertTrue(registerPage.getElement(registerPage.confirmPasswordInputField).isEnabled());

	}
	
	@Test
	public void testRegisterButonIsPresent() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(registerPage.getElement(registerPage.registerButton).isDisplayed());
		
	}
	
	@Test(dataProvider = "invalidUserDataForRegister", dataProviderClass = DataSet.class)
	public void testRegister(String Name, String Number, String Email, String Password, String ConfirmPassword, String SsName, By locator, String displayErrorMsg ) {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
	
		registerPage.writeOnAElement(registerPage.nameInputField,Name);
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
