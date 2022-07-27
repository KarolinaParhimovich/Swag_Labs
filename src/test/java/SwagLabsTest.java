import constants.SWAG_LABS_URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.factorypages.SwagLabsFactoryPage;

import static constants.SWAG_LABS_URLS.swagLabs;

public class SwagLabsTest extends BaseTest {


    @Test
    public void loginTest() {
        SwagLabsFactoryPage swagLabsFactoryPage=new SwagLabsFactoryPage(driver);
        swagLabsFactoryPage.openSwagLabs();
        swagLabsFactoryPage.enterUserName("standard_user");
        swagLabsFactoryPage.enterPassword("secret_sauce");
        swagLabsFactoryPage.pressLogin();
        swagLabsFactoryPage.addToCart();
        swagLabsFactoryPage.shoppingCartPress();
        String actualText=swagLabsFactoryPage.findActualPrice();
        Assert.assertEquals(actualText, "$29.99");

    }
}
