package pages.factorypages;

import constants.Credentials;
import constants.SWAG_LABS_URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class SwagLabsFactoryPage extends BaseFactoryPage {
    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement passWord;
    @FindBy(name = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;
    @FindBy(className = "inventory_item_price")
    private WebElement itemPrice;
    @FindBy(linkText = "LinkedIn")
    private WebElement linkedinButton;
    By cartLinkedin=By.xpath("//icon[@data-test-id='nav-logo']");
    @FindBy(xpath = "//icon[@data-test-id='nav-logo']")
   private WebElement LOGO_LINKEDIN;

    public SwagLabsFactoryPage(WebDriver driver) {
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

    public void addToCart() {
        addToCartButton.click();
    }

    public void shoppingCartPress() {
        shoppingCartLink.click();
    }

    public String findActualPrice() {
        return itemPrice.getText();

    }

    public void loginPage() {
        driver.get(SWAG_LABS_URLS.swagLabs);
        userName.sendKeys(Credentials.USERNAME);
        passWord.sendKeys(Credentials.PASSWORD);
        loginButton.click();
    }

    public void clickLinkedinButton() {
        linkedinButton.click();
    }

    public void switchToNewTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    public boolean logoLinkedin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(cartLinkedin));
        boolean textLogo=LOGO_LINKEDIN.isDisplayed();
        return textLogo;
    }
}


