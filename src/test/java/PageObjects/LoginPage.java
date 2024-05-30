package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public   LoginPage(WebDriver rdriver){ // here constructor is public , so we will use this in another package as well

        driver = rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement txtUserName;

    @FindBy(xpath = "//input[@class='password']")
    WebElement password;

    @FindBy(xpath = "//div[@class='buttons']/button")
    WebElement LoginButton;

    @FindBy(linkText = "Logout")
    WebElement LogoutButton;

    public void setUserName(String UserName){
        txtUserName.clear();
        txtUserName.sendKeys(UserName);
    }
    public void password(String pwd){
        password.clear();
        password.sendKeys(pwd);
    }
    public void ClickOnLogin(){
        LoginButton.click();
    }
    public void ClickOnLogout(){LogoutButton.click();}


}


