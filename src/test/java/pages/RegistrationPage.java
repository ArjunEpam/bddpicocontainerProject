package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(xpath = "//tagname[@attribute='value']")
    WebElement userName;

    public RegistrationPage(WebDriverManager driverManager) {
        driver = driverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

    public boolean regPage(){
         driver.get("http://automationpractice.com/");
         return userName.isDisplayed();

    }

    public void enterdetails(){
      userName.clear();
      userName.click();
    }
}
