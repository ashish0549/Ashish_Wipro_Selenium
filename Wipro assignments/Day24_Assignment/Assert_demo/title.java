package Assert_demo;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class title {
    WebDriver driver;
    boolean isTitleValid = false;  // Flag to track if title test passed or failed

    @Test
    public void titlee() {
        String expectedtitle = "Selenium dev";
        String actualtitle = driver.getTitle();
        
        try {
            Assert.assertEquals(actualtitle, expectedtitle, "Title Validation Failed");
            isTitleValid = true; // Set the flag to true if title test passes
            System.out.println("Expected Title: " + expectedtitle);
            System.out.println("Actual Title: " + actualtitle);
        } catch (AssertionError e) {
            isTitleValid = false; // Set the flag to false if title test fails
            System.out.println("Title Validation Failed");
            throw e; // Re-throw the exception to make the test fail
        }
    }

    @Test(dependsOnMethods = "titlee") // url() will run only after titlee() has passed
    public void url() {
        if (!isTitleValid) {
            System.out.println("Skipping URL validation as title validation failed.");
            return; // Skip this test if the title validation fails
        }
        
        String expurl = "https://www.selenium.dev/";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(expurl, actualurl, "URL validation failed");
    }

    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/");
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
