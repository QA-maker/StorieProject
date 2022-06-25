package mx.projectStorieComponents;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotStorie {
	
	/**
	 * Class dedicated to screenshots to be used as evidence.
	 * @author Ernesto Trejo
	 * @version: 21/06/2022
	 */

	
	protected static WebDriver driver;
	private String folderName = "\\src\\test\\resources\\TemporaryScreenshot\\nameFolder";
	//constructor
	
	public ScreenShotStorie(WebDriver driver) {
		ScreenShotStorie.driver=driver;
	}
	
	/**
	 * Method that will take the screenshot to add it to the report as evidence.
	 * 
	 * @param nameFolder - Define the name of the folder that will be the order
	 *                   number.
	 * @param numStep    - It defines the number of the step where I take the
	 *                   capture.
	 * @throws InterruptedException - It is launched when a thread is waiting or
	 *                              sleeping and another thread interrupts it using
	 *                              the interrupt method in the Thread class.
	 * @throws IOException          - (errors that cannot be avoided by the
	 *                              programmer, usually related to program
	 *                              input/output). They are used in Java to capture
	 *                              the exceptions that may have occurred in the
	 *                              code block delimited by try and catch.
	 *                              
	 *                              */
	
	public void ScreenShotStorie(String nameFolder, int numStep) throws InterruptedException,IOException {
		
		folderName= folderName.replace("nameFolder", nameFolder);
		String picturesName="\\"+"Screenshot -"+String.valueOf(numStep)+".png";
		picturesName=folderName+picturesName;
		
		File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShotFile, new File(picturesName));
		
	}

}
