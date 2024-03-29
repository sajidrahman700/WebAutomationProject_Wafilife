package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.DriverSetup;


public class TestMyAccount extends DriverSetup {
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	
	@Test(priority = 0, description = "Verify that the My account option is clickable", dependsOnGroups = "checkout")
	public void testMyAccountOption() {
		myAccountPage.loadAWebPage(homePage.homePageURL);
		
		try {
				headerPage.clickOnElement(headerPage.myAccount);
			
		}
		catch (Exception e) {
			loginPage.doLogin("tutt@gh.com", "ad");
		    headerPage.clickOnElement(headerPage.myAccount);
		}
		
		Assert.assertTrue(myAccountPage.getElement(myAccountPage.dashBoard).isDisplayed());
		Assert.assertEquals(myAccountPage.getElementText(myAccountPage.dashboardNotice), myAccountPage.displayDashboardNotice);
		
		
		
		
	}
	
	
	@Test(dependsOnMethods = "testMyAccountOption", priority = 1, description = "Verify that the user can log out by clicking the Logout option")
	public void testLogout() {
		myAccountPage.clickOnElement(myAccountPage.logout);
		Assert.assertTrue(loginPage.getElement(loginPage.loginButton).isDisplayed());
		
	}

}
