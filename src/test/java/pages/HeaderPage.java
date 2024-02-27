package pages;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {
	public By loginAndRegisterOption = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
	public By websiteLogo = By.xpath("//div[@class='logo heading-title']//a");
	public By searchbar = By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']");
	public By menuBar = By.xpath("//ul[@id='menu-main-menu-1']");
	public By myAccount = By.xpath("//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]");
	
	public By menu_Home = By.xpath("//ul[@id='menu-main-menu-1']/li[1]/a");
	public By menu_Book = By.xpath("//ul[@id='menu-main-menu-1']/li[2]/a");
	public By menu_GeneralBook = By.xpath("//ul[@id='menu-main-menu-1']/li[3]/a");
	public By menu_ArabicBook = By.xpath("//ul[@id='menu-main-menu-1']/li[4]/a");
	public By menu_Subject = By.xpath("//ul[@id='menu-main-menu-1']/li[5]/a");
	public By menu_Author = By.xpath("//ul[@id='menu-main-menu-1']/li[6]/a");
	public By menu_Publisher = By.xpath("//ul[@id='menu-main-menu-1']/li[7]/a");
	public By menu_PreOrder = By.xpath("//ul[@id='menu-main-menu-1']/li[9]/a");
	public By menu_Lifestyle = By.xpath("//ul[@id='menu-main-menu-1']/li[10]/a");
	public By menu_Stationary = By.xpath("//ul[@id='menu-main-menu-1']/li[11]/a");
	

}
