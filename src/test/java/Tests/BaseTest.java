package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	@Parameters({"browser_parm"})
	@BeforeClass
	public void SetUp(String browserParm){
		if(browserParm.equals("Chrome")){
			
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browserParm.equals("Firefox")){
			
		}else if (browserParm.equals("Safari")){
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	@AfterClass
	public void tearDown(){
		//driver.close();
		
	}

}
