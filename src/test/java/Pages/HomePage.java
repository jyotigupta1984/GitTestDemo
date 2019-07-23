package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	String baseUrl = "https://www.tesla.com/en_CA/models";
	By customerOrderBt = By.xpath("//a[@title='Custom Order']");
	By newInventory = By.id("inventory-link-top");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public HomePage launchUrl(){
		System.out.println("Enter in launchUrl");
		 driver.get(baseUrl);
	        return this;
		
	}
	public String getPageTitle(){
		System.out.println("Enter in getTitle");
		return driver.getTitle();
	} 
	
	public CustomerOrderPage gotoCustomerOrderPage(){
		System.out.println("Click on CUSTOMRBUTTON");
		click(customerOrderBt);
		System.out.println("after click CUSTOMRBUTTON");
		return new CustomerOrderPage(driver);
		
		
		
	}
	public Inventory goToNewInventory(){
		
		click(newInventory);
		return new Inventory(driver);
		
		
	}
	
	
	
	 
}
