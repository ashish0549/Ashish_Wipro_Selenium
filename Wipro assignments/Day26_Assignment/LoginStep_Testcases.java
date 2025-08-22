package StepDefination;


import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginStep_Testcases {
	WebDriver driver;
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
 
	@When("^click on login button and enter (.*)$")
	public void click_on_login_button_and_enter_username1(String username1) {
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys(username1);
	}
 
	@And("^add (.*)$")
	public void add_password1(String password1) {
	
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys(password1);
	   
	}
 
	@And("^click on signin button check (.*)$")
	public void click_on_signin_button_check_status(String status) {
		driver.findElement(By.name("submit")).click();
		System.out.println("Status of Test:"+status);
	   
	}
 
	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		driver.close();
	   
	}
 
 
}
