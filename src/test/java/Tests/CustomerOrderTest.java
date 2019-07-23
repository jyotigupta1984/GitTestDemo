package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CustomerOrderPage;
import Pages.HomePage;

public class CustomerOrderTest extends BaseTest{
	@Test
	public void ValidateCutomerOderonLudicrousMode() throws InterruptedException{
		System.out.println("Enter11111111111111111");
		HomePage home = new HomePage(driver);
		home  = home.launchUrl();
		String Title = 	home.getPageTitle();
		
		CustomerOrderPage customerPage = home.gotoCustomerOrderPage();
		System.out.println("Working");
		customerPage.selectPerformance();
		
		/*String IntialPurchaseprice = driver.findElement(By.xpath("//span[text()='Purchase price']//preceding-sibling::p")).getText();
		String IntialPotenTialSaving = driver.findElement(By.xpath("//span[text()='After potential savings']//preceding-sibling::p")).getText();*/
		long InitiPurchaseValue = convertStringToInt(customerPage.getValueOfPurchaseprice());
		long InitialPotentalValue = convertStringToInt(customerPage.getValueOfPotentialPrice());
		long DiscountAmount =convertStringToInt(customerPage.selectLudicurousAndreturmAmount());
		long ExpectedPurchaseValue = InitiPurchaseValue+DiscountAmount;
		long ExpectedPotentialValue =InitialPotentalValue+DiscountAmount;
		long ModifiedPurchaseValue = convertStringToInt(customerPage.getValueOfPurchaseprice());
		long ModifedPotentalValue = convertStringToInt(customerPage.getValueOfPotentialPrice());
		if (ExpectedPurchaseValue==ModifiedPurchaseValue && ExpectedPotentialValue==ExpectedPotentialValue ){
			System.out.println("pass ExpectedPurchaseValue");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
	
		}

		
	}
	
	
public long convertStringToInt(String str){
	str = str.replaceAll("[^a-zA-Z0-9]", "");
	long num = Long.parseLong(str);
	 
	return num;
	
	
	
}	

}
