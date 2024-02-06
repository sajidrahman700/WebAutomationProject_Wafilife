package pages;

import static utilities.DriverSetup.getBrowser;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Allure;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getBrowser().findElement(locator);

	}

	public void clickOnElement(By locator) {
		 getElement(locator).click();
	}

	public void writeOnAElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}

	public void hoverOnElement(By locator) {
		Actions actions = new Actions(getBrowser());
		actions.clickAndHold(getElement(locator)).build().perform();
	}

	public void loadAWebPage(String url) {
		getBrowser().get(url);
	}

	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	 public void takeScreenShot(String name){
	        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES)));
	    }
	 
	 public void scrollToAElement(By locator) {
		 JavascriptExecutor js = (JavascriptExecutor) getBrowser();
		 js.executeScript("arguments[0].scrollIntoView();", getElement(locator)); 
	 }
	 
	 public void selectDropdown(By locator, int number) {
		 Select select = new Select(getElement(locator));
		 getElement(locator).click();
		 select.selectByIndex(number);
	 }
	 
	 public void clearField(By locator) {
		 getElement(locator).clear();
	 }
	 
	 public void enterNumberOnAElement(By locator, int number) {
		 String text = String.valueOf(number);	
		 getElement(locator).sendKeys(text);
		}

}
