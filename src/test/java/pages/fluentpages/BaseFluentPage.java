package pages.fluentpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseFluentPage {
    public WebDriver driver;
    public BaseFluentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
