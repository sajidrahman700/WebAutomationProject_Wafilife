package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
	
    HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	LoginPage loginPage = new LoginPage();  
	
	
	
	@Test
	public void testloginPagetitle() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertEquals(getBrowser().getTitle(),loginPage.loginPageTitle);	
	}
	
	@Test
	public void testInputFieldIsPresent() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(loginPage.getElement(loginPage.userNameInputField).isEnabled());
		Assert.assertTrue(loginPage.getElement(loginPage.passwordInputField).isEnabled());

	}
	
	@Test
	public void testRegisterButonIsPresent() {
		getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(loginPage.getElement(loginPage.loginButton).isDisplayed());
		
	}
	
	@Test(dataProvider = "invalidUserDataForLogin", dataProviderClass = DataSet.class)
	public void testLoginWithInvalidCredentials(String userName, String password, String displayErrorMsg) {
		loginPage.doLogin(userName, password);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMessageField).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMessageField), displayErrorMsg );
			
	}
	
	@Test
	public void testLoginWithValidCredentials() {
		loginPage.doLogin("tutt@gh.com", "ad");
		Assert.assertEquals(getBrowser().getCurrentUrl(), loginPage.loginPageURL );
		Assert.assertTrue(loginPage.getElement(loginPage.loginButton).isDisplayed());	
	}
	

}
