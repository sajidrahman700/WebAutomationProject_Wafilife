package pages;



import org.openqa.selenium.By;


public class AuthorPage extends BasePage{
	public By pageNumberOption = By.xpath("//ul[@class='page-numbers']");
    public By authorList = By.xpath("//ul[@class='archive-product-subcategories']");
    public By pageNumberList = By.xpath("//ul[@class='page-numbers']/li");
    public By authorHeading = By.xpath("//h1[contains(text(),'লেখক')]");
    
    public void selectPagenumber(String number) {
            clickOnElement(By.xpath("//ul[@class='page-numbers']/li/a[text()='"+number+"']"));

	}
    
    public void selectAuthor(String name){
    	By element = By.xpath("//h3[normalize-space()='"+name+"']");
    	
    	scrollToAElement(element);
    	waitForElementToBeClickable(element);
		clickOnElement(element);
    	
	}
    
  public void loadAuthorPage() {
	  loadAWebPage("https://www.wafilife.com/cat/books/author");
  }
	
  
	/*public void selectPagenumber(String number){
		
		List<WebElement> elements = getListOfElement(pageNumberList);
	    for(int i = 0; i < elements.size(); i++) {
	        try {
	            if(elements.get(i).getText().equals(number)) {
	                elements.get(i).click();
	            }  
	        } catch (StaleElementReferenceException e) {
	        	//System.out.println(e);
	        }
	    }
	}*/


	
	/*public void selectAuthor(String name) {
		List<WebElement> elements = getListOfElement(pageNumberList);

	    for(int i = 1; i <= elements.size(); i++) {
	            WebElement element = getElement(By.xpath("//ul[@class='archive-product-subcategories']//li[" + i + "]/a[@class='author_name']"));
	           // System.out.println(element.getText());
	            if(element.getText().equalsIgnoreCase(name)) {
	            	scrollToAElement(element);
	                element.click();
	            } 
	    }
	}*/
}
	
	


