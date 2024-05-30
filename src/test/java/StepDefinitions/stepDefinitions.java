package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class stepDefinitions {
    WebDriver driver;
    @Given("I login to chrome Browser")
    public void i_login_to_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
        driver = new ChromeDriver();// launching chrome driver
//        throw new io.cucumber.java.PendingException();
    }
    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() throws InterruptedException {
        //We have to write selenium code here.
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(3000);
//        throw new io.cucumber.java.PendingException();
    }
    @Then("I verify the logo present on that page")
    public void i_verify_the_logo_present_on_that_page() {
     Boolean PageStatus=   driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img")).isDisplayed();
        Assert.assertEquals(true,PageStatus);
//        throw new io.cucumber.java.PendingException();
    }
    @Then("I close the Browser")
    public void i_close_the_browser() {
        driver.quit();
//        throw new io.cucumber.java.PendingException();
    }

}
