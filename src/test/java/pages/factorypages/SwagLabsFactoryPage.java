package pages.factorypages;

import constants.SWAG_LABS_URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
    public void addToCart(){
        addToCartButton.click();
    }
    public void shoppingCartPress(){
        shoppingCartLink.click();
    }
}

