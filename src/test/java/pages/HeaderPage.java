package pages;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {
	public By loginAndRegisterOption = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
	public By websiteLogo = By.xpath("//div[@class='logo heading-title']//a");
	public By searchbar = By.xpath("//div[@class='header_search']//input[@id='freeSearchBoxWeb']");
	public By menuBar = By.xpath("//ul[@id='menu-main-menu-1']");
	public By myAccount = By.xpath("//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]");
	
	

}
