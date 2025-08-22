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

public class Ebay_AllTests {

	WebDriver driver;
	
	@BeforeTest 
	public void beforeTest() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
	}

	@Test(priority = 1) 
	public void login() throws InterruptedException {
		
//		driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
		driver.findElement(By.cssSelector(".gh-identity-signed-out-unrecognized > a:nth-child(1)")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("userid")).sendKeys("nasirhussainraghav@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("SaiRaghav@1903");
		driver.findElement(By.id("sgnBt")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement sfn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passkeys-cancel-btn")));////a[@id='passkeys-cancel-btn']
		sfn.click();
		System.out.println("Sign in simulated");
		Thread.sleep(3000);
	}
	


	@Test(priority = 2) 
	public void multipleSearches() throws InterruptedException {
		
	     
		List<String> searchItems = Arrays.asList("Watch", "Phone", "Shoes");

		for (String item : searchItems) {
		    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
			search.clear();
			search.sendKeys(item);
			search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
	}

	@Test(priority = 3) 
	public void addToCartandDele() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
		search.clear();
		search.sendKeys("Headphones");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Sony WH-1000XM5/B Wireless Industry Leading Noise Canceling Bluetooth Headphones")).click();
		Thread.sleep(2000);
		
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
     
		try {
			driver.findElement(By.id("atcBtn_btn_1")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Add to cart button not found.");
		}
		driver.get("https://cart.ebay.com/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Remove button not found.");
		}
	}
	
	@Test(priority = 4)
	public void changeAddress() throws InterruptedException {
	    // Go to eBay home
	    driver.findElement(By.id("gh-logo")).click();
	    Thread.sleep(2000);

	    // Hover over "Hi Nasir!" menu
	    WebElement hiMsg = driver.findElement(By.cssSelector("span.gh-identity__greeting"));
	    Actions act = new Actions(driver);
	    act.moveToElement(hiMsg).perform();
	    Thread.sleep(2000);
	    driver.get("https://accountsettings.ebay.com/uas");
	    Thread.sleep(3000);

	    
	    driver.findElement(By.id("account-settings-link-PI")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("pass")).sendKeys("SaiRaghav@1903");
		driver.findElement(By.id("sgnBt")).click();

	   
	    driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	    Thread.sleep(2000);

	   
	    WebElement streetAddress = driver.findElement(By.cssSelector("input[aria-label='Street address']"));
	    streetAddress.clear();
	    streetAddress.sendKeys("");
	    Thread.sleep(1000);

	    //Middle Name
	    WebElement m_name = driver.findElement(By.id("middleName"));
	    m_name.clear();
	    m_name.sendKeys("Hussain");
	    Thread.sleep(1000);
	    

	    // City
	    WebElement city = driver.findElement(By.id("city"));
	    city.clear();
	    city.sendKeys("kurnool");
	    Thread.sleep(1000);

	    // Zipcode
	    WebElement zipcode = driver.findElement(By.id("postalCode"));
	    zipcode.clear();
	    zipcode.sendKeys("518002");
	    Thread.sleep(1000);

	  
	    // Submit button
	    driver.findElement(By.id("address_edit_submit_button")).click();
	    Thread.sleep(2000);
	}

    @Test(priority = 5)
    public void shopByCatTest() throws InterruptedException {
    	
        driver.navigate().to("https://www.ebay.com/");
        Actions act = new Actions(driver);
    	WebElement motors = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
    	act.moveToElement(motors).perform();
    	Thread.sleep (2000);
    
    	WebElement sports = driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
    	act.moveToElement(sports).perform();
    	Thread.sleep (2000);
    	
    	WebElement fashion= driver.findElement (By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
    	act.moveToElement(fashion).perform();
    	
        Thread.sleep(4000);
    }
    

    @Test(priority = 6)
    public void shopByallCatTest() throws InterruptedException {
      
        driver.findElement(By.id("gh-cat")).click();
        driver.findElement(By.id("gh-search-btn")).click();
        Assert.assertTrue(true,"Search button is not working");
        Thread.sleep(3000);
    }

//    
//    @Test(priority = 9)
//    public void rightclick() throws InterruptedException {
//    	
//    	WebElement search = driver.findElement(By.id("gh-ac"));
//		search.clear();
//		search.sendKeys("Headphones sony");
//		search.sendKeys(Keys.ENTER);
//		//Thread.sleep(2000);
//
//		
////		driver.findElement(By.cssSelector("img[src=\'https://i.ebayimg.com/images/g/ae0AAeSwZ29om5Ia/s-l500.webp\']"));
//		
//	    Actions act= new Actions(driver);
//	    WebElement rightclick=driver.findElement(By.partialLinkText("Sony WH-1000XM5/B Wireless Industry Leading Noise Canceling Bluetooth Headphones"));
//	    act.contextClick(rightclick).perform();
//	    Thread.sleep(2000);
//	}

	
	
//    @Test(priority = 10)
//    public void langChange() throws InterruptedException {
//    	JavascriptExecutor jse= (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        Thread.sleep(3000);
//        Actions act = new Actions(driver);
//        WebElement Changelang = driver.findElement(By.xpath("//button[@class='gf-flag__button']"));
//        act.moveToElement(Changelang).perform();
////        driver.findElement(By.xpath("//button[@class='gf-flag__button']")).click();
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Italy")));
//        WebElement lang = driver.findElement(By.linkText("Italy"));
//    	act.moveToElement(lang).perform();
//    	lang.click();
//    	
//    	driver.get("https://www.ebay.it/");
//    	Thread.sleep (3000);
//
//       
//    }
//    
    @Test(priority = 7)

    public void languageChange() throws InterruptedException {
        driver.navigate().to("https://www.ebay.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		driver.findElement(By.linkText("China")).click();

	}
    
    
    

	@AfterTest 
	public void afterTest() {
		driver.quit();
		System.out.println("Browser closed. Test completed.");
	}
}
