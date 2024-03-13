package pages;

import org.openqa.selenium.By;

public class BooksDisplayPage extends BasePage {
	public By booksList = By.xpath("//ul[contains(@class,'products')]");
	
	public By sorting = By.xpath("//select[contains(@class,'select_field')]");
	
	public void bookSelect(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']");
    	scrollToAElement(element);
		clickOnElement(element);
	}
	
	public By bookAuthorName(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']/following-sibling::div[@class='wd_product_categories']");
		return element;
	}
	
	public By bookPrice(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']/following-sibling::span[@class='price']");
		return element;
		
	}
	
	public String BooksDisplayTitle(String name) {
		String title=""+name+" Books | List of books by author "+name+" | Wafilife"; 
		return title;
	}
	

}
