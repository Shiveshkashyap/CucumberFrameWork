package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
    public WebDriver driver;

    public addCustomerPage(WebDriver rdriver){
        driver=rdriver;
        PageFactory.initElements(driver,this);
    }

    By lnkCustomers_menu=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
    By getLnkCustomers_menuitem =By.xpath("//a[@href='/Admin/Customer/List']");
    By btnAddNew = By.xpath("//a[@href='/Admin/Customer/Create']");
    By txtEmail = By.xpath("//input[@type='email']");
    By txtPassword= By.id("Password");
    By txtFirstName = By.id("FirstName");
    By txtLastName= By.id("LastName");
    By selectGender = By.xpath("//input[@name='Gender'][1]");
    By selectDateOfBirth= By.id("DateOfBirth");
    By txtCompanyName= By.id("Company");
    By checkBoxTaxExempt = By.id("IsTaxExempt");
    By txtNewsletter= By.xpath("//input[@class='select2-search__field']");
    By dropdownMenu = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--focus select2-container--below']//input[@role='searchbox']");
    By lstItemVenodr = By.xpath("//li[contains(text(),'Vendors')]");
    By listItemGuest = By.xpath("//li[contains(text(),'Guests')]");
    By dropdownVendorId = By.xpath("//*[@id = 'VendorId']");
    By checkBoxActive = By.xpath("//input[@checked='checked']");
    By txtBox= By.xpath("//textarea[@class='form-control']");
    By submitButton= By.xpath("//button[@type='submit'][@name='save']");


}
