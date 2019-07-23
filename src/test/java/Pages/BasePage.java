package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public  WebDriver driver;
	public WebDriverWait wait;
	
	public  BasePage(WebDriver driver){
		System.out.println("Test");
		this.driver=driver;
		wait = new WebDriverWait(driver, 20);
		
	}
	public WebElement waitVisibilityOfElement(By WebElement){
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(WebElement));
		
	}
	public void click(By element){
		waitVisibilityOfElement(element).click();
		
	}
	public void writeText(By element,String text){
		
		waitVisibilityOfElement(element).sendKeys(text);
	}
	public String  getText(By element){
		
		return waitVisibilityOfElement(element).getText();
	}
	
	
	
	
	
	
	
	
	
}
