package pages.fluentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.fluentpages.BaseFluentPage;

public class PurchasesFluentPage extends BaseFluentPage {
    @FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;
    public PurchasesFluentPage(WebDriver driver) {
        super(driver);
    }
    public boolean isAddToCartIsDisplayed(){
        return addToCartButton.isDisplayed();
    }
}
