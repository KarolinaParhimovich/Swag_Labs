package tests;
import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListeners;

import java.util.concurrent.TimeUnit;

@Listeners(TestListeners.class)
public class BaseThreadLocalTest {
    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    public WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory factory = new DriverFactory();
        DriverType type = null;
        if (browser.equals("chrome")) {
            type = DriverType.CHROME;
        } else if (browser.equals("firefox")) {
            type = DriverType.FIREFOX;
        }
        DriverManager driverManager = factory.getManager(type);
        driverManager.createDriver();
        driverManager.startMaximize();
        driverManager.setTimeout();
        threadLocalDriver.set(driverManager.getDriver());
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void setImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void removeImplicitlyWait(){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        threadLocalDriver.get().quit();
    }
}
