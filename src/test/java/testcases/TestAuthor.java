package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AuthorPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.DriverSetup;

public class TestAuthor extends DriverSetup {
	
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	AuthorPage authorPage = new AuthorPage();
	SoftAssert softAssert = new SoftAssert();	
	
	
	@Test(priority = 0)
	public void testDisplayAuthorNames() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		Assert.assertTrue(authorPage.getElement(authorPage.authorList).isDisplayed());
		
	}
	
	@Test(priority = 1)
	public void testNextPageNumber() {
		try{
			//homePage.loadAWebPage(homePage.homePageURL);
	        //headerPage.clickOnElement(headerPage.menu_Author);
	        authorPage.scrollToAElement(authorPage.pageNumberList);
	        authorPage.selectPagenumber("2");
	        softAssert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed(), "Author heading is not displayed");
		}
	    finally{
	    	getBrowser().navigate().back();
	    }
	    }
	    
	
	@Test(priority = 2)
	public void testRightwardArrow() {
		try{
			//homePage.loadAWebPage(homePage.homePageURL);
		    //headerPage.clickOnElement(headerPage.menu_Author);
		    authorPage.scrollToAElement(authorPage.pageNumberList);
		    authorPage.selectPagenumber("→");
		    softAssert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed());
		}
		finally{
			getBrowser().navigate().back();
		}
	}
	
	@Test(priority = 3)
	public void testDisplayBooksOfAAuthor() {
		//homePage.loadAWebPage(homePage.homePageURL);
		//headerPage.clickOnElement(headerPage.menu_Author);
		//getBrowser().navigate().back();
		authorPage.waitForElementToBeClickable(authorPage.authorList);
		authorPage.selectAuthor("M. N. Pearson");
		
	}
	

}
