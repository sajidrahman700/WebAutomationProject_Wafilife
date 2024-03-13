package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AuthorPage;
import pages.BooksDisplayPage;
import pages.HeaderPage;
import pages.HomePage;
import utilities.DriverSetup;

public class TestBooksDisplay extends DriverSetup{
	HomePage homePage = new HomePage();
	HeaderPage headerPage = new HeaderPage();
	AuthorPage authorPage = new AuthorPage();
	BooksDisplayPage booksDisplayPage = new BooksDisplayPage();
	
	
	@Test(priority = 0)
	public void testBookNameAndPrice() {
		homePage.loadAWebPage(homePage.homePageURL);
		headerPage.clickOnElement(headerPage.menu_Author);
		authorPage.selectAuthor("Mahbub Hasan Lingcon");
		Assert.assertEquals(booksDisplayPage.getElementText(booksDisplayPage.bookSelect("Chemistry - 1st Paper (Class XI-XII)")),"Chemistry - 1st Paper (Class XI-XII)");
		Assert.assertEquals(booksDisplayPage.bookPrice("Chemistry - 1st Paper (Class XI-XII)"),"580৳");	
	}
	
	
	@Test(priority = 1)
    public void testAuthorNameOfBook() {
		Assert.assertEquals(booksDisplayPage.bookAuthorName("Chemistry - 1st Paper (Class XI-XII)"),"MAHBUB HASAN LINGCON, MD. NURUL ISLAM, ড. মো. আব্দুল করিম");
	}
    
	
	@Test(priority = 2)
    public void testSortingBooks() {
		booksDisplayPage.waitForElementToBeClickable(booksDisplayPage.sorting);
		booksDisplayPage.selectDropdownByText(booksDisplayPage.sorting, "Price - High to Low");
		Assert.assertEquals(booksDisplayPage.getSelectOptionText(booksDisplayPage.sorting),"Price - High to Low");
	}
    
	
	@Test(priority = 3)
    public void testSelectABook() {
		booksDisplayPage.waitForElementToBeClickable(booksDisplayPage.bookSelect("Chemistry - 1st Paper (Class XI-XII)"));
		booksDisplayPage.clickOnElement(booksDisplayPage.bookSelect("Chemistry - 1st Paper (Class XI-XII)"));
		Assert.assertEquals(booksDisplayPage.selectedBookTitle("Chemistry – 1st Paper (Class XI-XII)"), "CHEMISTRY – 1ST PAPER (CLASS XI-XII)");
	
	}
    
	
	@Test(priority = 4)
    public void testBookDescription() {
		booksDisplayPage.clickOnElement(booksDisplayPage.readMore);
		Assert.assertTrue(booksDisplayPage.getElement(booksDisplayPage.description).isDisplayed());
		
	}

	
	

}
