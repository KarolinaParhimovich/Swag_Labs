package pages.loadablepages;

import constants.SWAG_LABS_URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fluentpages.BaseFluentPage;
import pages.fluentpages.PurchasesFluentPage;


public class LoginLoadablePage extends BaseLoadablePage {
    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement passWord;
    @FindBy(name = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    public LoginLoadablePage(WebDriver driver) {
        super(driver);
    }

    public void openSwagLabs() {
        driver.get(SWAG_LABS_URLS.swagLabs);
    }
    public void enterUserName(String username) {
        userName.sendKeys("standard_user");
    }

    public void enterPassword(String password) {
        passWord.sendKeys("secret_sauce");
    }

    public void pressLogin() {
        loginButton.click();
    }
    @Override
    public boolean isPageOpened() {
        return addToCartButton.isDisplayed();
    }
}


