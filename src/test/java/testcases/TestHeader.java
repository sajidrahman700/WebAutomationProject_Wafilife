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
	
	@Test
	public void testDisplayLoginRegister() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.loginAndRegisterOption).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.loginAndRegisterOption).isEnabled());
		
	}
	
	@Test
	public void testDisplayLogo() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.websiteLogo).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.websiteLogo).isEnabled());
		
	}
	
	@Test
	public void testDisplayMenuBar() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.menuBar).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.menuBar).isEnabled());
		
	}
	
	@Test
	public void testDisplaySearchBar() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(headerPage.getElement(headerPage.searchbar).isDisplayed());
		softAssert.assertTrue(headerPage.getElement(headerPage.searchbar).isEnabled());
		
		
	}
	
	@Test
	public void testOpenAMenu() {
		getBrowser().get(homePage.homePageURL);
		String menuURL = headerPage.getElementURL(headerPage.menu_Book);
		headerPage.clickOnElement(headerPage.menu_Book);
		Assert.assertEquals(getBrowser().getCurrentUrl(),menuURL);
		
		
	}
	
	@Test
	public void testLogoFunctionality() {
		getBrowser().get(homePage.homePageURL);
		String logoURL = headerPage.getElementURL(headerPage.websiteLogo);
		headerPage.clickOnElement(headerPage.websiteLogo);
		Assert.assertEquals(getBrowser().getCurrentUrl(), logoURL);
		
	}
	
	@Test
	public void testOpenLoginAndRegisterPage() {
		getBrowser().get(homePage.homePageURL);
		String loginRegisterURL = headerPage.getElementURL(headerPage.loginAndRegisterOption);
		headerPage.clickOnElement(headerPage.loginAndRegisterOption);
		Assert.assertEquals(getBrowser().getCurrentUrl(), loginRegisterURL);
		
	}

}
