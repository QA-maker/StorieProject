package mx.projectStorieCollections.StorieCollection;

import java.sql.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import mx.projectStorieComponents.ScreenShotStorie;
import mx.projectStoriePages.GeneralMethods;
import mx.projectStoriePages.HomePage;
import mx.projectStoriePages.StorieSite;


public class TestParameters {
	
	/**
	 * This class is where you define the parameters of the test for its execution
	 * is parent to the RunTest class.
	 * 
	 * @author
	 * @version: 
	 *
	 */
	
		// Class variables.
		private static String chromeDriver = "src\\test\\resources\\Driver\\chromedriver.exe";
		protected static WebDriver driver;
		protected static Driver pageDriver;
		protected static StorieSite storieTest;
		protected static GeneralMethods generalMethods;
		protected static HomePage homepage;
		protected static ScreenShotStorie takescreenshot;
		protected static ChromeOptions options;
		
		
		// before is the class where the browser parameters are executed as the objects
		// of the classes that will be used.
		@Before
		public void before() {
			System.setProperty("webdriver.chrome.driver", chromeDriver);
			options = new ChromeOptions();
			options.addArguments("start-maximized");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.geolocation", 1);
			prefs.put("profile.default_content_setting_values.notifications", 1);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			storieTest= new mx.projectStoriePages.StorieSite(driver);
			generalMethods= new mx.projectStoriePages.GeneralMethods(driver);
			homepage=new mx.projectStoriePages.HomePage(driver);
			takescreenshot= new mx.projectStorieComponents.ScreenShotStorie(driver);
		}
	}
