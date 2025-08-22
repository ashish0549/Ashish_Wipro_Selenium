package Testng_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ebay_usingPagecalling {
	WebDriver driver;
	PageClass pg;
	@BeforeTest 
	public void beforeTest() throws InterruptedException 
	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
	}
	
//	@Test(priority = 1) 
//	public void loggingin() throws InterruptedException 
//	{
//	
//        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
//        PageClass pg=new PageClass(driver);
//        pg.email_in();
//        pg.cont_in();
//        pg.pass_in();
//        pg.submit_in();
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement sfn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passkeys-cancel-btn")));////a[@id='passkeys-cancel-btn']
//		sfn.click();
//		System.out.println("Sign in simulated");
//		Thread.sleep(3000);
//	}
	@Test(priority = 1) 
	public void loggingin() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
		pg.login();
	}
	
	
	@Test(priority = 2) 
	public void ms() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
		pg.multipleSearches();
	}
	
	@Test(priority = 3) 
	public void addingtoCartandDelete() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
		pg.addToCartandDelete();
	}
	@Test(priority = 4)
	public void changeAandN() throws InterruptedException 
	{
	   PageClass pg=new PageClass(driver);
	   pg.changeAddressAndName();
	}
	@Test(priority = 5)
    public void shoppingByCatTest() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
    	pg.shopByCatTest();
        
    }
	@Test(priority = 6)
	public void shoppingByallCatTest() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
		pg.shopByallCatTest();
	      
	}
	@Test(priority = 7)

	public void languageChange() throws InterruptedException 
	{
		PageClass pg=new PageClass(driver);
		pg.LanguageChange();

    }	
	@AfterTest 
	public void afterTest() {
		driver.quit();
		System.out.println("Browser closed. Test completed.");
	}
	
}
