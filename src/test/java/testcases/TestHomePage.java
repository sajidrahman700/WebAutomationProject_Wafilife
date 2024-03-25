package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup{
	
	HomePage homePage = new HomePage();
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority = 0, description = "Verify that featured books are displayed on the home page")
	public void testDisplayFeatureBooks() {
		getBrowser().get(homePage.homePageURL);
		softAssert.assertTrue(homePage.getElement(homePage.newPublishedBooks_feature).isDisplayed());
		//softAssert.assertTrue(homePage.getElement(homePage.preOrderBooks_feature).isDisplayed());
		
	}
	
	@Test(priority = 1, description = "Verify that any deals, discounts, or carousel banner are correctly displayed on the home page",dependsOnMethods = "testDisplayFeatureBooks")
	public void testDisplayCarouselBanner() {
		//getBrowser().get(homePage.homePageURL);
		homePage.waitForElementToBeClickable(homePage.carouselIndicator_2nd);
		homePage.clickOnElement(homePage.carouselIndicator_2nd);
		homePage.waitForElementPresence(homePage.carouselBanner_2nd);
		Assert.assertTrue(homePage.getElement(homePage.carouselBanner_2nd).isDisplayed());
	}
	
	@Test(priority = 2, description = "Verify that carousel banners are working perfectly",groups = "homepage",dependsOnMethods = "testDisplayFeatureBooks")
	public void testOpenCarouselBanner() {
		//getBrowser().get(homePage.homePageURL);
		homePage.waitForElementToBeClickable(homePage.carouselIndicator_3rd);
		homePage.clickOnElement(homePage.carouselIndicator_3rd);
		String bannerURL = homePage.getElementURL(homePage.carouselBanner_3rd);
		homePage.clickOnElement(homePage.carouselBanner_3rd);
		Assert.assertEquals(getBrowser().getCurrentUrl(),bannerURL);
		
	}

}
