package findingelements;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementPresent {


	ChromeDriver driver ; 
	@BeforeTest 
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com");
	}


	@Test
	public void testIsFound() throws InterruptedException
	{
		if (isFound(By.xpath("//*[@id=\"checkboxes\"]/input[1]")))
		{
			WebElement check1 =driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
			if (!check1.isSelected())
			{
				check1.click();
			}
		}
		else {

			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi");
			//Assert.fail("checkbox 1 is not found");

		}
		Thread.sleep(4000); 
	}

	private boolean isFound(By byy) {
		try {
			driver.findElements(byy); 
			//System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi");
			return true ; 
		} catch (NoSuchElementException e) {
			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi");
			return false ; 
		}
	}

	@AfterTest
	public void  afterTest()

	{
		driver.quit();
	}
}


