package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByTagName {

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
	   public void  testFindByTagName()
	{	
	//	WebElement usernameTxt = driver.findElement(By.id("username"));
	//	WebElement passwordTxt = driver.findElement(By.name("password"));
	//	WebElement loginBtn = driver.findElement(By.className("radius"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		loginBtn.click();
		
	//	System.out.println(usernameTxt.getTagName());
	//	System.out.println(passwordTxt.getLocation());
	//	System.out.println(loginBtn.getText());
	}
	@AfterTest
      public void  afterTest()
	{
		//driver.quit();
	}
}
