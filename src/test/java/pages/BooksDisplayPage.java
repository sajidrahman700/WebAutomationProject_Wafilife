package pages;

import org.openqa.selenium.By;

public class BooksDisplayPage extends BasePage {
	public By booksList = By.xpath("//ul[contains(@class,'products')]");
	public By sorting = By.xpath("//select[contains(@class,'select_field')]");
	public By description = By.xpath("//div[@class='short-description']");
	public By readMore = By.xpath("//a[contains(text(),'আরো পড়ুন')]");
	
	public String selectedBookTitle(String name) {
		String title= getElementText(By.xpath("//h1[contains(text(),'"+name+"')]"));
		return title;
	}
	
	public By bookSelect(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']");
    	return element;
	}
	
	public String bookAuthorName(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']/following-sibling::div[@class='wd_product_categories']");
		return getElementText(element);
	}
	
	public String bookPrice(String name) {
		By element = By.xpath("//ul/li/div/div[2]/h3[normalize-space()='"+name+"']/following-sibling::span[@class='price']");
		return getElementText(element);	
	}
	
	public String BooksDisplayPageTitle(String name) {
		String title=""+name+" Books | List of books by author "+name+" | Wafilife"; 
		return title;
	}
	

}
