package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class FindElementByID 
{
		ChromeDriver driver ; 
		@BeforeTest 
		     public void openURL()
		{
			System.setProperty("webdriver.chrome.driver", 
			         System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/login");
		}
		@Test
		   public void  findElemenyByID()
		{	
			WebElement usernameTxt = driver.findElement(By.id("username"));
			WebElement passwordTxt = driver.findElement(By.id("password"));
			System.out.println(usernameTxt.getTagName());
			System.out.println(passwordTxt.getTagName());
			
		}
		@AfterTest
	      public void  afterTest()

		{
			
			//driver.quit();

		}



	
}
