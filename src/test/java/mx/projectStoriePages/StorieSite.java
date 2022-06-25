package mx.projectStoriePages;

import org.openqa.selenium.WebDriver;

import mx.projectStorieCollections.*;
import mx.projectStorieComponents.*;


public class StorieSite {
	
	 private WebDriver driver;
	 public StorieSite(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public HomePage homepage() {
		 this.driver=driver;
		 return new HomePage(driver);
	 
	    }
	 
	 public ScreenShotStorie takescreenshot() {
		 this.driver=driver;
	        return new ScreenShotStorie(driver);
		 
	 }

}
