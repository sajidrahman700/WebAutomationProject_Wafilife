package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage {
	
	public By productAddedMsg = By.xpath("//span[@class='title']");
	public By shoppingCartButton = By.xpath("//span[contains(text(),'শপিং ব্যাগ')]");
	public By completeOrderButon = By.xpath("//a[@class='checkout-button button alt wc-forward']");
	
	public By quantityUpdate(int number) {
		return By.xpath("//tbody/tr["+number+"]/td[3]/div/input[2]");	
	}
	
	public String displayAddProductName(int number) {
		return getElementText(By.xpath("//tbody/tr["+number+"]/td[2]/a"));
	}
	
	public String displayAddProductPrice(int number) {
		return getElementText(By.xpath("//tbody/tr["+number+"]/td[2]/span[2]/bdi"));
	}

}
