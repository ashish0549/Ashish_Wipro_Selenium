package StepDefination;

//import java.time.Duration;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Arrays;
//import org.openqa.selenium.interactions.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import StepDefination.ebay_cucumberpageclass;
//
//public class ebay_cucumber {
//	 WebDriver driver;
//	    ebay_cucumberpageclass ebay;
//
//	    @Given("User launches eBay application")
//	    public void user_launches_eBay_application() {
//	        driver = new FirefoxDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://www.ebay.com/");
//	        ebay = new ebay_cucumberpageclass(driver);
//	    }
//
//	    @When("User logs into the application")
//	    public void user_logs_into_the_application() throws InterruptedException {
//	        ebay.login();
//	    }
//
//	    @And("User performs multiple product searches")
//	    public void user_performs_multiple_product_searches() throws InterruptedException {
//	        ebay.multipleSearches();
//	    }
//
//	    @And("User adds a product to cart and deletes it")
//	    public void user_adds_a_product_to_cart_and_deletes_it() throws InterruptedException {
//	        ebay.addToCartandDelete();
//	    }
//
//	    @And("User updates address and middle name in account settings")
//	    public void user_updates_address_and_middle_name_in_account_settings() throws InterruptedException {
//	        ebay.changeAddressAndName();
//	    }
//
//	    @And("User navigates through Shop by Category")
//	    public void user_navigates_through_shop_by_category() throws InterruptedException {
//	        ebay.shopByCatTest();
//	    }
//
//	    @And("User performs search using All Categories")
//	    public void user_performs_search_using_all_categories() throws InterruptedException {
//	        ebay.shopByallCatTest();
//	    }
//
//	    @And("User changes site language to Italian")
//	    public void user_changes_site_language_to_italian() throws InterruptedException {
//	        ebay.LanguageChange();
//	    }
//
//	    @Then("Application should function as expected and browser is closed")
//	    public void application_should_function_as_expected_and_browser_is_closed() {
//	        driver.quit();
//	        System.out.println("All tests executed and browser closed.");
//	    }
//}
//	
//
