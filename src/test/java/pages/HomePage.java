package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public String homePageURL = "https://www.wafilife.com/";
	public String homePageTitle = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";
	
	public By carouselIndicator_1st = By.xpath("//div[@class='owl-controls']/div[contains(@class,\"owl-dots\")]/div[3]");
	public By carouselIndicator_2nd = By.xpath("//div[@class='owl-controls']/div[contains(@class,\"owl-dots\")]/div[4]");
	public By carouselIndicator_3rd = By.xpath("//div[@class='owl-controls']/div[contains(@class,\"owl-dots\")]/div[1]");
	
	public By carouselBanner_1st = By.xpath("//div[@class='owl-stage']/div[1]/a[contains(@href,\"https://www.wafilife.com\")]");
	public By carouselBanner_2nd = By.xpath("//div[@class='owl-stage']/div[2]/a[contains(@href,\"https://www.wafilife.com\")]");
	public By carouselBanner_3rd = By.xpath("//div[@class='owl-stage']/div[3]/a[contains(@href,\"https://www.wafilife.com\")]");
	
	public By newPublishedBooks_feature = By.xpath("//div[@id='featured_product_slider_wrapper_372855925']");
	public By preOrderBooks_feature = By.xpath("//div[@id='featured_product_slider_wrapper_2039621852']");
	
	

}
