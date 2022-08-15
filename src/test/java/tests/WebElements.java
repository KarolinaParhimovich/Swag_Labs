package tests;

import org.openqa.selenium.By;

public class WebElements {
    By logo = By.className("login_logo");
    By errorMessage = By.className("error-message-container");
    By shoppingCart = By.className("shopping_cart_link");
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.name("login-button");
    By bot = By.className("bot_column");
    By credentials = By.xpath("//div[@class='login_credentials']");
    By openMenu = By.xpath("//button[text()='Open Menu']");
    By products = By.xpath("//span[contains(text(),'Products')]");
    By addToCart = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By peek = By.xpath("//div[contains(@class,'peek')]");
    By nameAtoZ = By.xpath("//*[text()='Name (A to Z)']//ancestor::option");
    By price = By.cssSelector("inventory_item_price");
    By remove = By.id("remove-sauce-labs-backpack");

}
