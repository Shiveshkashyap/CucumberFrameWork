package StepDefinitionPageObject;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    public WebDriver driver;// publicly driver define
    public LoginPage lp;// create a object of Login page
    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C://Driver//chromedriver.exe");
        // initializing the chrome driver
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }

    @When("User open url {string}")
    public void user_open_url(String url) {
        driver.get(url);

    }
    @When("User Enter Email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String username, String password) {
            lp.setUserName(username);
            lp.password(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        lp.ClickOnLogin();

    }

    @Then("Page Title Should be {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }else
        {
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        lp.ClickOnLogout();
        Thread.sleep(5000);

    }

    @Then("Page Title  should be {string} after logout")
    public void page_title_should_be_after_logout(String titles) {
       if (driver.getTitle().equals(titles)){
           Assert.assertTrue(true);
       }
       else {

           driver.quit();
       }

    }
    @Then("close browser")
    public void close_browser () {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }}
