package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {
	
    HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	LoginPage loginPage = new LoginPage(); 
	MyAccountPage myAccountPage = new MyAccountPage();
	
	
	
	@Test(priority = 0, description = "Verify the login page title", dependsOnGroups = "header")
	public void testloginPagetitle() {
		//getBrowser().get(homePage.homePageURL);
		homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertEquals(getBrowser().getTitle(),loginPage.loginPageTitle);	
	}
	
	@Test(priority = 1, description = "Verify that all required fields are present in the login section",dependsOnMethods = "testloginPagetitle")
	public void testInputFieldIsPresent() {
		//getBrowser().get(homePage.homePageURL);
		//homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(loginPage.getElement(loginPage.userNameInputField).isEnabled());
		Assert.assertTrue(loginPage.getElement(loginPage.passwordInputField).isEnabled());

	}
	
	@Test(priority = 2, description = "Verify that the Login button is present",dependsOnMethods = "testloginPagetitle")
	public void testRegisterButonIsPresent() {
		//getBrowser().get(homePage.homePageURL);
		//homePage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertTrue(loginPage.getElement(loginPage.loginButton).isDisplayed());
		
	}
	
	@Test(dataProvider = "invalidUserDataForLogin", dataProviderClass = DataSet.class, priority = 3, description = "Verify Login with invalid credentials",dependsOnMethods = "testloginPagetitle")
	@Severity(SeverityLevel.CRITICAL)
	public void testLoginWithInvalidCredentials(String userName, String password, String displayErrorMsg) {
		loginPage.doLogin(userName, password);
		Assert.assertTrue(loginPage.getElement(loginPage.errorMessageField).isDisplayed());
		Assert.assertEquals(loginPage.getElementText(loginPage.errorMessageField), displayErrorMsg );
			
	}
	
	
	@Test(priority = 4, description = "Verify that successfully login after clicking the Login button with a valid credential",groups = "login",dependsOnMethods = "testloginPagetitle")
	@Severity(SeverityLevel.CRITICAL)
	public void testLoginWithValidCredentials() {
		loginPage.doLogin("tutt@gh.com", "ad");
		Assert.assertTrue(myAccountPage.getElement(myAccountPage.dashBoard).isEnabled());
		Assert.assertEquals(myAccountPage.getElementText(myAccountPage.dashboardNotice), myAccountPage.displayDashboardNotice);
	}
	

}
