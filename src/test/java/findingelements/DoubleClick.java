package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DoubleClick {
	ChromeDriver driver ; 
	@BeforeTest 
	public void openURL() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
		Thread.sleep(4000);
	}
	@Test 
	public void DoubleClickk() throws InterruptedException
	{
		WebElement message = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		//WebElement message = driver.findElement(By.id("message"));
		//to verify  the color  is blue
	    Assert.assertEquals("rgba(0, 0, 255, 1)",message.getCssValue("background-color"));
	    System.out.println(message.getCssValue("background-color"));
	   //  the below 2 lines is for the double click 
		Actions bulders = new Actions(driver);
		bulders.doubleClick(message).perform();
		Thread.sleep(4000);
		// to verify  the color  is yellow 
		Assert.assertEquals("rgba(255, 255, 0, 1)",message.getCssValue("background-color"));
		System.out.println(message.getCssValue("background-color"));
	}
	@AfterTest
	public void  afterTest()

	{
		driver.quit();
	}
}
