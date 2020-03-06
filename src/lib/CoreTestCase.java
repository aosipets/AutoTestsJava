//package lib;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.ScreenOrientation;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.net.URL;
//import java.time.Duration;
//
//public class CoreTestCase  {
//    private static final String PLATFORM_IOS = "ios";
//    private static final String PLATFORM_ANDROID = "android";
//
//    protected AppiumDriver driver;
//    String appiumURL = "http://127.0.0.1:4723/wd/hub";
//
//    @Before
//    public void setUp() throws Exception
//    {
//        driver = this.driver();
//        this.rotateScreenPortrait();
//    }
//
//    @After
//    public void tearDown()  {
//        driver.quit();
//    }
//    protected void rotateScreenPortrait()
//    {
//        driver.rotate(ScreenOrientation.PORTRAIT);
//    }
//    protected void rotateScreenLandscape()
//    {
//        driver.rotate(ScreenOrientation.LANDSCAPE);
//
//    }
//    protected void backgroundApp(int seconds)
//
//    {
//        driver.runAppInBackground (Duration.ofSeconds(seconds));
//    }
//
//    private AppiumDriver driver() throws Exception
//    {
//        String platform = System.getenv("PLATFORM");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        if (platform.equals(PLATFORM_ANDROID)) {
//            capabilities.setCapability("platformName","Android");
//            capabilities.setCapability("deviceName","AndroidTestDevice");
//            capabilities.setCapability("platformVersion","6.0");
//            capabilities.setCapability("automationName","Appium");
//            capabilities.setCapability("appPackage","org.wikipedia");
//            capabilities.setCapability("appActivity",".main.MainActivity");
//            capabilities.setCapability("app","/Users/alexanderosipets/Documents/javaAppiumAutomation/apks/org.wikipedia.apk");
//            //capabilities.setCapability("automationName", "UiAutomator2");
//            driver = new AndroidDriver(new URL(appiumURL), capabilities);
//
//
//        } else if (platform.equals(PLATFORM_IOS)){
//            capabilities.setCapability("platformName","iOS");
//            capabilities.setCapability("deviceName","iPhone 11 Pro Max");
//            capabilities.setCapability("platformVersion","13.3");
//            capabilities.setCapability("app","/Users/alexanderosipets/Documents/javaAppiumAutomation/apks/Wikipedia.app");
//            driver = new IOSDriver(new URL(appiumURL), capabilities);
//        }else{
//            throw new Exception("Cannot get run platform from env variable. Platform value "  + platform);
//        }
//        return driver;
//
//    }
//}
