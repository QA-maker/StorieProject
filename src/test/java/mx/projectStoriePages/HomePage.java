package mx.projectStoriePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import mx.projectStorieComponents.*;


public class HomePage extends Driver{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/*public void TypeText() {
		try {
		WebElement text = driver.findElement(mx.projectStorieComponents.StorieComponnents.CountriesSelect);
		safeClick(text);
		waitUntilClickable(text).sendKeys("Me");		 
	}catch (Exception e) {
		e.getMessage();}
	}*/
	
	public void clickButton() {
		WebElement btnView= driver.findElement(By.xpath("//a[@class='btn btn-white btn-xl']"));
		safeClick(btnView);
	}
	
	public void getListName()throws Exception {
		List<WebElement> getList;
		List<WebElement> rowCourses;
		int contador = 0;
		
		
		 getList=  driver.findElements(By.xpath("//div[@class='rt-tbody']//div"));//obtiene lista de la tabla
		 String print = "";
		 
		 for (WebElement getlistrow: getList) {
			 contador = contador + 1;
			 rowCourses= driver.findElements(By.xpath("//div[@class='rt-tbody']//div[" + String.valueOf(contador)+ "]//div"));//extraemos tod registros de las tablas
			 
			 for(WebElement columnslist:rowCourses) {
				 print = columnslist.getText();
				 System.out.println("Elementos de la tabla son  \n"+print);
			 }
			 
		 }
		 
		
	}
	
	public void addRegister() throws Exception{
		WebElement 
		
	}

}
