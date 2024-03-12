package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthorPage extends BasePage{
	
    public By authorList = By.xpath("//ul[@class='archive-product-subcategories']");
    public By pageNumberList = By.xpath("//ul[@class='page-numbers']");
    public By authorHeading = By.xpath("//h1[contains(text(),'লেখক')]");
	
	public void selectPagenumber(String number) {
		List<WebElement> elements = getListOfElement(pageNumberList);
		
		for(int i = 1; i <= elements.size(); i++) {
            WebElement element = getElement(By.xpath("//ul[@class='page-numbers']/li["+i+"]/span"));
            //System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase(number)) {
                element.click();
            } 
	    }

	}


	
	public void selectAuthor(String name) {
		List<WebElement> elements = getListOfElement(pageNumberList);

	    for(int i = 1; i <= elements.size(); i++) {
	            WebElement element = getElement(By.xpath("//ul[@class='archive-product-subcategories']//li[" + i + "]/a[@class='author_name']"));
	           // System.out.println(element.getText());
	            if(element.getText().equalsIgnoreCase(name)) {
	            	scrollToAElement(element);
	                element.click();
	            } 
	    }
	}
}
	
	


