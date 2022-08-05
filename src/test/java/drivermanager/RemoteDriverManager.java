package drivermanager;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RemoteDriverManager extends DriverManager{
    @Override
    public void createDriver() {
        SafariOptions browserOptions = new SafariOptions();
        browserOptions.setCapability("platformName", "macOS 12");
        browserOptions.setCapability("browserVersion", "15");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "1");
        sauceOptions.put("name", "Login to saucedemo");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            driver = new RemoteWebDriver( new URL("https://karolina2410:e6b8053d-ff4b-41dd-a866-56bd8ada4e2a@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), browserOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
