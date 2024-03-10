package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthorPage extends BasePage{
	
public WebElement selectPagenumber(String number) {
		
		for(WebElement element:getListOfElement(By.xpath("//ul[@class='page-numbers']"))) {
	    	if(element.getText().equalsIgnoreCase(number)) {
	    		return element;
	    		
	    	}
	         }
		return null;
	}
	
	
	public WebElement selectAuthor(String name) {
		
		for(WebElement element:getListOfElement(By.xpath("//ul[@class='archive-product-subcategories']"))) {
	    	if(element.getText().equalsIgnoreCase(name)) {
	    		return element;
	    		
	    	}
	         }
		return null;
	}
	

}
