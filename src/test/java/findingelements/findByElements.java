package findingelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class findByElements {
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
	public void  testFindElements()
	{	
		//1  WebElement usernameTxt = driver.findElement(By.id("username"));
		//	1 WebElement passwordTxt = driver.findElement(By.name("password"));
		//  1 WebElement loginBtn = driver.findElement(By.className("radius"));
		 //1  System.out.println(usernameTxt.getTagName());
		//	1 System.out.println(passwordTxt.getLocation());
		//	1 System.out.println(loginBtn.getText());
		// 2click on login//      WebElement loginBtn = driver.findElement(By.tagName("button"));
		// 2click on login//      loginBtn.click();
		//3 tablegettagename//       WebElement table  = driver.findElement(By.id("table1"));
		//3 tablegettagename //     List<WebElement> rows = table.findElements(By.tagName("tr"));
		//3 tablegettagename //    System.out.println(rows.size());
		//3 tablegettagename//     System.out.println(rows.get(3) .getText()); 
		//4 csssector //     WebElement headerLbl  = driver.findElement(By.cssSelector("h2"));
		//4 csssector //	WebElement usernameTxt  = driver.findElement(By.cssSelector("input#username"));
		//4 csssector //	WebElement passwordTxt  = driver.findElement(By.cssSelector("input#password"));
		//4 csssector //	WebElement loginBtn = driver.findElement(By.cssSelector("button.radius"));
		//4 csssector //   System.out.println(loginBtn.getText());  
		//4 csssector //	 System.out.println(usernameTxt.getTagName()); 
		//4 csssector //	 System.out.println(passwordTxt.getTagName()); 
		//4 csssector //     System.out.println(headerLbl.getText());
		// comment 5 get all the links displayed on the page 
		//5 get# of links and printlinks //List<WebElement> links = driver.findElements(By.tagName("a"));
		//5 get# of links and printlinks //System.out.println(links.size()); 
		//5 get# of links and printlinks //Assert.assertEquals(46, links.size());
		//5 get# of links and printlinks //for (WebElement link : links ) {
		//5 get# of links and printlinks //System.out.println(link.getAttribute("href"));
			
		
	}
	@AfterTest
	public void  afterTest()
	{
		driver.quit();
		//  for 1&2&4 use   https://the-internet.herokuapp.com/login
		//  for 3 use  https://the-internet.herokuapp.com/tables
		//  for 5 use  https://the-internet.herokuapp.com/
	}

}
