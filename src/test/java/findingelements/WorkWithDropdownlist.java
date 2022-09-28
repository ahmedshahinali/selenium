package findingelements;

import java.lang.StackWalker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkWithDropdownlist {

	ChromeDriver driver ; 
	

	@BeforeTest 
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
	}
	@Test
	public void  testDropdownlist() throws InterruptedException
	{	
		
		WebElement optionlist = driver.findElement(By.id("dropdown"));
	  	Select selectoptions = new Select(optionlist) ; 
		Assert.assertFalse(selectoptions.isMultiple()); 
		Assert.assertEquals(3 , selectoptions.getOptions().size());
		// can use any of the below aptions 
		//selectoptions.selectByVisibleText("Option 2"); 
		//selectoptions.selectByValue("5");
		//selectoptions.selectByIndex(2);
		Thread.sleep(4000);
	}
@AfterTest
	public void  afterTest()
	{
		driver.quit();

	}
}
