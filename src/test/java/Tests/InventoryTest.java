package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Inventory;

public class InventoryTest extends BaseTest {
	

	public InventoryTest(){
		super();
	}
	
	@Test
	public void  validateNewInventoryStock(){
		
		HomePage homePage = new HomePage(driver);
		homePage = homePage.launchUrl();
		Inventory inv ;
		inv = homePage.goToNewInventory();
		
		inv.selecteModles("Model X | SUV");
		inv.selectPostalCode("K2J");
		inv.selectDistance("25 kilometers");
		inv.selectedExteriorPaint("Blue");
		
	}
}
