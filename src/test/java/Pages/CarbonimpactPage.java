package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarbonimpactPage extends BasePage {
	public CarbonimpactPage(WebDriver driver){
		super(driver);
		
	}
	String baseUrl = "https://www.tesla.com/en_CA/carbonimpact";
	By btWorld = By.xpath("//div[@id='root']//li[text()='world']");
	
	public  CarbonimpactPage  launchUrl(){		
		driver.get(baseUrl);
		return new CarbonimpactPage(driver);
		
	}
	public void SwitchToWorld(){
		click(btWorld);
		
	}
	
	public String getNameofCountryByRank(int rank){
	String  elementpath =" //section [@class='leaderboard-world']//section[@class='list']//div["+rank+"]//span[@class='col col-location']/span";
		return driver.findElement(By.xpath(elementpath)).getText();
		
	}
	public String getRankByCountry(String country){
		String xpath = "//section [@class='leaderboard-world']//section[@class='list']//div//span[text()='"+country+"']/parent::span/preceding-sibling::span";
		return driver.findElement(By.xpath(xpath)).getText();
		
		
		
	}
	
	

}
