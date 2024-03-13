package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {
	
	public static String browserName = System.getProperty("browser", "Chrome");
    private static final ThreadLocal<WebDriver>  LOCAL_BROWSER = new ThreadLocal<>();
    
    
    public static void setBrowser(WebDriver browser) {
        DriverSetup.LOCAL_BROWSER.set(browser);
    }

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }


    public WebDriver getBrowser(String browserName){
        if (browserName.equalsIgnoreCase("Chrome"))
            return new ChromeDriver();
        else if (browserName.equalsIgnoreCase("Edge"))
            return new EdgeDriver();
        else if (browserName.equalsIgnoreCase("Firefox"))
            return new FirefoxDriver();
        else {
            throw new RuntimeException("Browser is not available with the given name: " + browserName);
        }
    }

    
    @BeforeClass
    public void openABrowser(){
        WebDriver browser = getBrowser(browserName);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setBrowser(browser);
    }

    @AfterClass
    public void quiteBrowser(){
        getBrowser().quit();
    }

}
