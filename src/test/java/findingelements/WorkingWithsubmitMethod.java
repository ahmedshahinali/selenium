package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithsubmitMethod {



	ChromeDriver driver ; 
	WebElement search ;

	@BeforeTest 
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	@Test
	public void  submit()
	{	
		search = driver.findElement(By.name("q"));
		search.clear(); 
		search.sendKeys("ahmed shahin");
		search.submit();
		search = driver.findElement(By.name("q"));
		search.clear(); 
		search.sendKeys("ahmed");
		search.submit();
	}

	public void  afterTest()
	{
		//.quit();

	}

}

