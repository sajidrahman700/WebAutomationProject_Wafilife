package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HeaderPage;
import pages.HomePage;
import utilities.DriverSetup;

public class TestHeader extends DriverSetup {
	
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority = 0, description = "Verify that the Login and Register option is displayed", dependsOnGroups = "homepage")
	public void testDisplayLoginRegister() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.loginAndRegisterOption).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.loginAndRegisterOption).isEnabled());
		
	}
	
	@Test(priority = 1, description = "Verify whether the logo of the website is added or not on the header")
	public void testDisplayLogo() {
		//getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.websiteLogo).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.websiteLogo).isEnabled());
		
	}
	
	@Test(priority = 2, description = "Verify that the Menu bar is added to the header")
	public void testDisplayMenuBar() {
		//getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.menuBar).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.menuBar).isEnabled());
		
	}
	
	@Test(priority = 3, description = "Verify that the Search bar is added to the header")
	public void testDisplaySearchBar() {
		//getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.searchbar).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.searchbar).isEnabled());
		
		
	}
	
	@Test(priority = 4, description = "Verify that all menu options should be opened after clicking any menu")
	public void testOpenAMenu() {
		//getBrowser().get(homePage.homePageURL);
		String menuURL = headerPage.getElementURL(headerPage.menu_Book);
		headerPage.clickOnElement(headerPage.menu_Book);
		Assert.assertEquals(getBrowser().getCurrentUrl(),menuURL);
		
		
	}
	
	@Test(priority = 5, description = "Verify the home page should be open by clicking on the logo on all pages")
	public void testLogoFunctionality() {
		getBrowser().get(homePage.homePageURL);
		String logoURL = headerPage.getElementURL(headerPage.websiteLogo);
		headerPage.clickOnElement(headerPage.websiteLogo);
		Assert.assertEquals(getBrowser().getCurrentUrl(), logoURL);
		
	}
	
	@Test(priority = 6, description = "Verify that the Login and Register option should be clickable",groups = "header")
	public void testOpenLoginAndRegisterPage() {
		//getBrowser().get(homePage.homePageURL);
		String loginRegisterURL = headerPage.getElementURL(headerPage.loginAndRegisterOption);
		headerPage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertEquals(getBrowser().getCurrentUrl(), loginRegisterURL);
		
	}

}
