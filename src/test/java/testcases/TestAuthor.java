package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AuthorPage;
import pages.BooksDisplayPage;
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
	BooksDisplayPage booksDisplayPage = new BooksDisplayPage();
	
	
	@Test(priority = 0, description = "Verify that displays a list of author names after clicking the Author option",dependsOnGroups = "login")
	public void testDisplayAuthorNames() {
		//homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		Assert.assertTrue(authorPage.getElement(authorPage.authorList).isDisplayed());
		
	}
	
	@Test(priority = 1, description = "Verify the next page number option", dependsOnMethods = "testDisplayAuthorNames")
	public void testNextPageNumber(){
		
			//authorPage.loadAuthorPage();
	        authorPage.scrollToAElement(authorPage.pageNumberList);
	        authorPage.selectPagenumber("2");
	        softAssert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed());
	        getBrowser().navigate().back();
		 
	    }
	    
	
	@Test(priority = 2, description = "Verify the Rightward Arrow option", dependsOnMethods = "testNextPageNumber")
	public void testRightwardArrow(){
		
			//authorPage.loadAuthorPage();
		    authorPage.scrollToAElement(authorPage.pageNumberList);
		    authorPage.selectPagenumber("→");
		    softAssert.assertTrue(authorPage.getElement(authorPage.authorHeading).isDisplayed());
			getBrowser().navigate().back();
	}
	
	@Test(priority = 3, description = "Verify that the author's all books are displayed after clicking the author's name", dependsOnMethods = "testRightwardArrow",groups = "AuthorBook")
	public void testDisplayBooksOfAAuthor(){
		//authorPage.loadAuthorPage();
		authorPage.selectAuthor("Mahbub Hasan Lingcon");
		Assert.assertEquals(getBrowser().getTitle(), booksDisplayPage.BooksDisplayPageTitle("Mahbub Hasan Lingcon"));
		
		
	}
	

}
