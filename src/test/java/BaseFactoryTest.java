import drivermanager.DriverFactory;
import drivermanager.DriverManager;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseFactoryTest {
    public WebDriver driver;
    public DriverManager driverManager;
    @BeforeMethod
    public void setUp() {
        DriverFactory driverFactory=new DriverFactory();
        driverManager=driverFactory.getManager(DriverType.CHROME);
        driverManager.createDriver();
        driverManager.setTimeout();
        driverManager.startMaximize();
        driver=driverManager.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driverManager.quitDriver();
    }
}
