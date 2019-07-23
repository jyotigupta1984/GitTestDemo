package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerOrderPage extends BasePage {
	public CustomerOrderPage(WebDriver driver){
		super(driver);
	}
	By perfomanceBt = By.xpath("//span/p[text()='Performance']");
	By purchasePrice = By.xpath("//span[text()='Purchase price']//preceding-sibling::p");
	By potentialPrice = By.xpath("//span[text()='After potential savings']//preceding-sibling::p");
	By LudicrousMode =By.xpath("//span/p[text()='Ludicrous Mode']");
	By LudicrousModeAmount = By.xpath("//span/p[text()='Ludicrous Mode']//parent::span/following-sibling::span/span");
	
	
	
	public void selectPerformance(){
		click(perfomanceBt);
		
		
	}
	public String getValueOfPurchaseprice( ){
		return getText(purchasePrice);
		
	}
	public String getValueOfPotentialPrice(){
		return getText(potentialPrice);
		
	}
	public String selectLudicurousAndreturmAmount(){
		
		click(LudicrousMode);
		return getText(LudicrousModeAmount);
	}

}
