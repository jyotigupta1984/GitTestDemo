package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CarbonimpactPage;

public class CarbonImpactTest extends BaseTest{
	
	
	@Test
	public void validateCountryRank(){
		CarbonimpactPage carPage = new CarbonimpactPage(driver);
		carPage.launchUrl();
		carPage.SwitchToWorld();
		String countryName = carPage.getNameofCountryByRank(2);
		System.out.println("County name with rank2 is "+countryName);
		if(!countryName.equals("Canada")){
			String rank = carPage.getRankByCountry("Canada");
			System.out.println("Rank for candaCountry is  "+rank);
			Assert.assertEquals(countryName, "Canada");
		}
		
		
	}
		

}
