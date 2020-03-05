package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class iOSTestCase {

    protected AppiumDriver driver;
    String appiumURL = "http://127.0.0.1:4723/wd/hub";

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("deviceName","iPhone 11 Pro Max");
        capabilities.setCapability("platformVersion","13.3");
        capabilities.setCapability("app","/Users/alexanderosipets/Documents/javaAppiumAutomation/apks/Wikipedia.app");


        driver = new IOSDriver(new URL(appiumURL), capabilities);
        this.rotateScreenPortrait();
    }
    @After
    public void tearDown()  {
        driver.quit();
    }
    protected void rotateScreenPortrait()
    {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }
    protected void rotateScreenLandscape()
    {
        driver.rotate(ScreenOrientation.LANDSCAPE);

    }
    protected void backgroundApp(int seconds)

    {
        driver.runAppInBackground (Duration.ofSeconds(seconds));
    }
}
