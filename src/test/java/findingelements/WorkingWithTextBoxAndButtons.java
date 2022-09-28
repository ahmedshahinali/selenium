package findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBoxAndButtons {

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
	public void  workonloginscreen() throws InterruptedException
	{	
		/*1
		WebElement usernameTxt = driver.findElement(By.id("username"));
		 WebElement passwordTxt = driver.findElement(By.name("password"));
		 WebElement loginBtn = driver.findElement(By.className("radius"));
		 System.out.println(usernameTxt.getTagName());
		System.out.println(passwordTxt.getLocation());
		 System.out.println(loginBtn.getText());
		 */
		/*2
		     WebElement loginBtn = driver.findElement(By.tagName("button"));
		      loginBtn.click();
		 */
		/*3
		  WebElement table  = driver.findElement(By.id("table1"));
		  List<WebElement> rows = table.findElements(By.tagName("tr"));
		  System.out.println(rows.size());
		   System.out.println(rows.get(3) .getText()); 
		 */
		/*4
		  WebElement headerLbl  = driver.findElement(By.cssSelector("h2"));
		WebElement usernameTxt  = driver.findElement(By.cssSelector("input#username"));
		WebElement passwordTxt  = driver.findElement(By.cssSelector("input#password"));
			WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
		  System.out.println(loginBtn.getText());  
		 System.out.println(usernameTxt.getTagName()); 
			 System.out.println(passwordTxt.getTagName()); 
		   System.out.println(headerLbl.getText());
		 */
		/*5 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size()); 
		 Assert.assertEquals(46, links.size());
		 for (WebElement link : links ) {
		 System.out.println(link.getAttribute("href"));
        */
		//6 is below
		WebElement txtUsername = driver.findElement(By.id("username"));	
		WebElement txtPassword  = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.className("radius"));
		txtUsername.clear();
		txtUsername.sendKeys("tomsmith");
		txtPassword.clear();
		txtPassword.sendKeys("SuperSecretPassword!");
		btnLogin.click();
		WebElement success = driver.findElement(By.id("flash"));
		System.out.println(success.getText());
		Assert.assertTrue(success.getText()
				.contains("You logged"));
		Thread.sleep(4000);
	}
	@AfterTest
	public void  afterTest()
	{
		driver.quit();
		//  for 1&2&4&6  use   https://the-internet.herokuapp.com/login
		//  for 3 use  https://the-internet.herokuapp.com/tables
		//  for 5 use  https://the-internet.herokuapp.com/
	}

}
