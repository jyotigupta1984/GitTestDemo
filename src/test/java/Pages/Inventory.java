package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Inventory extends BasePage
{
	//jyotiii

	public Inventory(WebDriver driver) {
		super(driver);
	}
	
	public void selecteModles(String text){
		/*System.out.println("Selectec that lable");
		WebElement we = driver.findElement(By.xpath("//input[@id='mx']"));
		System.out.println("after that lable");
		Actions ac = new Actions(driver);
		ac.moveToElement(we).click().build().perform();*/
		
	List<WebElement> elements=	driver.findElements(By.xpath("//ul[@class='iso-list-group']/li"));
	
	for(WebElement el:elements){
		
		WebElement lable = el.findElement(By.tagName("label"));
		if(lable.getText().trim().equals(text.trim())){
			
			System.out.println("Selectec that lable");
			//lable.click();
			WebElement wenele = lable.findElement(By.xpath(".//parent::span/child::input"));
			System.out.println(wenele.getTagName());
			System.out.println(wenele.getLocation());
			System.out.println(wenele.getAttribute("id"));
			//wenele.click();
			Actions ac = new Actions(driver);
			ac.moveToElement(wenele).click().build().perform();
			//Postal code 
			driver.findElement(By.xpath("//input[@value='K2J']")).sendKeys("M4X1R3");;
		
		}
	//	System.out.println("lable"+lable.getText());
	}
	
		
		
	}
	
	public void selectPostalCode(String text){
		//Postal code 
		driver.findElement(By.xpath("//input[@value='"+text+"']")).sendKeys("M4X1R3");
	}
	public void selectDistance(String text){
		List<WebElement> elementList =     driver.findElements(By.xpath("//ul[@class='iso-list-group iso-list-group--input']//li"));
		
		for (WebElement el :elementList){
			
			WebElement labeltag = el.findElement(By.tagName("label"));
			System.out.println(labeltag.getTagName());
			System.out.println(labeltag.getLocation());
		//	System.out.println(labeltag.getAttribute("id"));
			System.out.println(labeltag.getText());
			if (labeltag.getText().trim().equals(text.trim())){
				labeltag.click();
				
			}
			
		}
	}
	
	public void selectedExteriorPaint(String color){
		List<WebElement> eleList = driver.findElements(By.xpath("//ul[@class = 'iso-list-group filter-type--category filter-type--category-PAINT paint']//li"));;
		for (WebElement ele:eleList){
			List<WebElement> divEle = ele.findElements(By.tagName("div"));
			for(WebElement div :divEle ){
			System.out.println(div.getText());
			System.out.println(div.getAttribute("class"));
			/*if(div.getText().trim().equals()){
				div.click();
				break;
			}*/
			
		}
		
	}

	}
}
