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
	
	public void clickButtonaddFormart() {
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
	
	public void scrollTable() throws Exception{
		
		
		scrollToElement(By.xpath("//legend[contains( text(), 'Web Table Example')]"));
	}
	
	public void gewtListCourses() throws Exception{
		List <WebElement> getCourses;
		List <WebElement> getrowCourses;
		int contador =0;
		
		getCourses = driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tbody//tr"));
		String print ="";
		
		for(WebElement getrows: getCourses) {
			contador= contador +1;
			getrowCourses= driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tbody//tr["+String.valueOf(contador)+"]//td"));
			
			for (WebElement rowNames:getrowCourses) {
				print=rowNames.getText();
				System.out.println("Obteniendo valores /n"+print);
			}
		}
	}
	
	public void addRegister() throws Exception{
		WebElement btnAdd= driver.findElement(mx.projectStorieComponents.StorieComponnents.btnAddRegister);
		safeClick(btnAdd);
		
		
	}
	public void EnterFormat() throws Exception{
		try {
		WebElement Name= driver.findElement(By.cssSelector("#firstName"));
		safeClick(Name);
		waitUntilClickable(Name).sendKeys("Ernesto");
		System.out.println("Nombre"+Name);
		}catch (Exception e) {
			e.getMessage();
		}
		
		}
	public void EnterLastName() throws Exception{
		WebElement Name= driver.findElement(mx.projectStorieComponents.StorieComponnents.fieldLastName);
		waitUntilClickable(Name).click();
		
		waitUntilClickable(Name).sendKeys("Trejo");
	
	}
	public void EnterMail() throws Exception{
		WebElement Name= driver.findElement(mx.projectStorieComponents.StorieComponnents.email);
		waitUntilClickable(Name).click();
		
		waitUntilClickable(Name).sendKeys("cybsarynet@gmail.com");
	
	}
	
	public void EnterAge() throws Exception{
		WebElement age= driver.findElement(mx.projectStorieComponents.StorieComponnents.fieldAge);
		waitUntilClickable(age).click();
		
		waitUntilClickable(age).sendKeys("42");
	}
	
	public void EnterSalary() throws Exception{
		WebElement salary= driver.findElement(mx.projectStorieComponents.StorieComponnents.fielSalary);
		waitUntilVisible(salary).click();
		
		waitUntilClickable(salary).sendKeys("45000");
	}
	
	public void EnterDepartment() throws Exception{
		WebElement dept= driver.findElement(mx.projectStorieComponents.StorieComponnents.Department);
		waitUntilClickable(dept).click();
		
		waitUntilClickable(dept).sendKeys("Automation QA");
	}
	
	public void btnsubmit() throws Exception{
		WebElement submit= driver.findElement(mx.projectStorieComponents.StorieComponnents.btnSubmit);
		waitUntilClickable(submit).click();
		
		
	}
}


