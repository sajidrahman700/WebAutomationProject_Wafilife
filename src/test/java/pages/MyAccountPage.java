package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {
	
	public String myAccountPageURL = "https://www.wafilife.com/my-account";
	
	public By dashBoard = By.xpath("//a[contains(text(),'ড্যাশবোর্ড')]");
	public By orders = By.xpath("//a[contains(text(),'অর্ডার সমূহ')]");
	public By address = By.xpath("//a[normalize-space()='Addresses']");
	public By wallet = By.xpath("//a[contains(text(),'ওয়ালেট')]");
	public By profile = By.xpath("//a[contains(text(),'প্রোফাইল')]");
	public By wishlist = By.xpath("//a[normalize-space()='Wishlist']");
	public By logout = By.xpath("//a[contains(text(),'লগআউট')]");
	
	public String displayDashboardNotice= "From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.";
	public By dashboardNotice = By.xpath("//div[@id='template-wrapper']//p[2]");

}
