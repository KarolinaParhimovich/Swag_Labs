package pages.fluentpages;

import constants.SWAG_LABS_URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginFluentPage extends BaseFluentPage {
    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement passWord;
    @FindBy(name = "login-button")
    private WebElement loginButton;

    public LoginFluentPage(WebDriver driver) {
        super(driver);
    }

    public LoginFluentPage openSwagLabs() {
        driver.get(SWAG_LABS_URLS.swagLabs);
        return new LoginFluentPage(driver);
    }

    public LoginFluentPage enterUserName(String username) {
        userName.sendKeys("standard_user");
        return this;
    }

    public LoginFluentPage enterPassword(String password) {
        passWord.sendKeys("secret_sauce");
        return this;
    }

    public PurchasesFluentPage pressLogin() {
        loginButton.click();
        return new PurchasesFluentPage(driver);
    }
}


