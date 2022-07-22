import constants.SWAG_LABS_URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static constants.SWAG_LABS_URLS.swagLabs;

public class SwagLabsTest extends BaseTest {


    @Test
    public void loginTest() {
        driver.get(swagLabs);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack"));
        String actualText=driver.findElement(By.className("inventory_item_price")).getText();
        Assert.assertEquals(actualText, "$29.99");

    }
}
