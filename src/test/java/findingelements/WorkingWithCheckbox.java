package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCheckbox {
	ChromeDriver driver ; 
	@BeforeTest 
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ahmed\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	}
	@Test
	public void  testcheckbox() throws InterruptedException
	{	
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		check1.click();
		Thread.sleep(4000); 

		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

		if (check2.isSelected())
			
		{ check2.click();
		}
		Thread.sleep(4000);  
	}
	@AfterTest
	public void  afterTest()

	{
		driver.quit();
	}
}



