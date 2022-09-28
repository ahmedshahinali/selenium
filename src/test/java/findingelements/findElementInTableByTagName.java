


package findingelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class findElementInTableByTagName {
	ChromeDriver driver ; 
	@BeforeTest 
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
	}
	@Test
	public void  testFindByTagName() throws InterruptedException
	{	
		

		WebElement table  = driver.findElement(By.id("table1"));
		  List<WebElement> rows = table.findElements(By.tagName("tr"));
		  System.out.println(rows.size());
		  System.out.println(rows.get(3) .getText()); 
		Thread.sleep(4000);  
	}
	@AfterTest
	public void  afterTest()
	{
		driver.quit();
		
	}

}
