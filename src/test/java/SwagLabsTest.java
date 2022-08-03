import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SwagLabsFactoryPage;

public class SwagLabsTest extends BaseFactoryTest {


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
    @Test
    public void linkedinTest(){
        SwagLabsFactoryPage swagLabsFactoryPage=new SwagLabsFactoryPage(driver);
        swagLabsFactoryPage.loginPage();
        removeImplicitlyWait();
        swagLabsFactoryPage.clickLinkedinButton();
        setImplicitlyWait();
        swagLabsFactoryPage.switchToNewTab();
        Assert.assertTrue(swagLabsFactoryPage.logoLinkedin());
    }
}
