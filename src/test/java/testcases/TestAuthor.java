package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

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
	AuthorPage authorPage = new AuthorPage()
;	
	@Test
	public void testDisplayAuthorNames() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		Assert.assertTrue(authorPage.getElement(authorPage.authorList).isDisplayed());
		
	}
	
	@Test
	public void testNextPageNumber() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		authorPage.scrollToAElement(authorPage.pageNumberList);
	    authorPage.selectPagenumber("2");
		Assert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed());
		
		
	}
	
	@Test
	public void testRightwardArrow() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		authorPage.scrollToAElement(authorPage.pageNumberList);
		authorPage.selectPagenumber("→");
		Assert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed());
		
	}
	
	@Test
	public void testDisplayBooksOfAAuthor() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		authorPage.selectAuthor("Dr. Muhammad Moniuzzaman");
		
	}
	

}
