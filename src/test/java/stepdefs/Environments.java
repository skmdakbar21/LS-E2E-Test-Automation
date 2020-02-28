package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Environments{
   
    private String username, authkey;
    private RemoteWebDriver driver;    
    
@Before
public WebDriver setUp() throws Throwable {

username = System.getenv().get("CBT_USERNAME"); //CBT username from system env variables
authkey = System.getenv().get("CBT_AUTHKEY"); //CBT authkey from system env variables

final String browser = System.getProperty("browser");
System.out.println("Browser is " + browser);

final DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("name", "LS E2E Test Automation");
caps.setCapability("record_video", "true");

if (browser.equals("chrome")) {
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("chromeminus1")) {
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("version", "Latest-1");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("firefox")) {
    caps.setCapability("browserName", "Firefox");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("safari13")) {
    caps.setCapability("browserName", "Safari");
    caps.setCapability("version", "13");
    caps.setCapability("platform", "Mac OSX 10.15");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("safari12")) {
    caps.setCapability("browserName", "Safari");
    caps.setCapability("version", "12");
    caps.setCapability("platform", "Mac OSX 10.14");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("edge")) {
    caps.setCapability("browserName", "MicrosoftEdge");
    caps.setCapability("version", "79");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
} else if (browser.equals("ie11")) {
    caps.setCapability("browserName", "Internet Explorer");
    caps.setCapability("version", "11");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");

    if(driver == null)
    driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
    
    return driver;
} else if (browser.equals("localChrome")) {
    final String DRIVERS_CHROMEDRIVER = "src/test/drivers/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", DRIVERS_CHROMEDRIVER);
    if(driver == null)
    driver = new ChromeDriver();
    return driver;
} else { // defaults to chrome, if none passed as browser
    caps.setCapability("browserName", "Chrome");
    caps.setCapability("platform", "Windows 10");
    caps.setCapability("screenResolution", "1366x768");
    return driver = new RemoteWebDriver(
            new URL("http://" + username + ":" + authkey + "@hub.crossbrowsertesting.com:80/wd/hub"), caps);
}
}

@After
public void teardown() {
if (driver != null) {
driver.quit();
driver = null;
}
}

}