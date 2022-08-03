package pages.loadablepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class BaseLoadablePage {
    public WebDriver driver;
    public BaseLoadablePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public abstract boolean isPageOpened();
}
