package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SwagLabsFactoryPage;
import utils.RetryAnalyzer;

public class SwagLabTest extends BaseThreadLocalTest {


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest() {
        SwagLabsFactoryPage swagLabsFactoryPage=new SwagLabsFactoryPage(threadLocalDriver.get());
        swagLabsFactoryPage.openSwagLabs();
        swagLabsFactoryPage.enterUserName("standard_user");
        swagLabsFactoryPage.enterPassword("secret_sauce");
        swagLabsFactoryPage.pressLogin();
        swagLabsFactoryPage.addToCart();
        swagLabsFactoryPage.shoppingCartPress();
        String actualText=swagLabsFactoryPage.findActualPrice();
        Assert.assertEquals(actualText, "$29.99");
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void linkedinTest(){
        SwagLabsFactoryPage swagLabsFactoryPage=new SwagLabsFactoryPage(threadLocalDriver.get());
        swagLabsFactoryPage.loginPage();
        removeImplicitlyWait();
        swagLabsFactoryPage.clickLinkedinButton();
        setImplicitlyWait();
        swagLabsFactoryPage.switchToNewTab();
        Assert.assertTrue(swagLabsFactoryPage.logoLinkedin());
    }
}
