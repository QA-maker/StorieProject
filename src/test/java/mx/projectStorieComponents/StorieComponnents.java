package mx.projectStorieComponents;


import org.openqa.selenium.By;

public class StorieComponnents {
	
	public final static int stopShortTimeMilliseconds = 3000;
	public final static int stopMediumTimeMilliseconds = 5000;
	public final static int stopLongTimeMilliseconds = 18000;

	public final static String urlProject = "https://rahulshettyacademy.com/AutomationPractice/";
	public final static String urlDemo="https://demoqa.com/webtables";
	// Components Home Page Elements

		public final static By CountriesSelect = By.xpath("//input[@type='text' and @id='autocomplete']");
		public final static By selectOptions = By.xpath("//select[@id='dropdown-class-example']");
		public final static By windowButton = By.xpath("//button[@id='openwindow']");// realizar manejo de Errores
		public final static By OpenTab = By.xpath("//a[@id='opentab']");// take screenshoot
		public final static By textAlert = By.xpath("//input[@id='name']");
		public final static By ButtonAlert = By.xpath("//input[@id='alertbtn']");
		public final static By ButtonConfirm = By.xpath("//input[@id='confirmbtn']");
		public final static By textHigligth = By.xpath("//iframe[@id='courses-iframe']");
		
// Components Practice Page
		
		public final static By inputText= By.xpath("//input[@id='searchBox']");
		public final static By btnAddRegister= By.xpath("//button[@id='addNewRecordButton']");
//components form Page
			public final static By fieldName= By.xpath("//input[@id='firstName']");
			public final static By fieldLastName= By.xpath("//input[@id='lastName']");
			public final static By email= By.xpath("//input[@id='userEmail']");
			public final static By fieldAge=By.xpath("//input[@id='age']");
			public final static By fielSalary= By.xpath("//input[@id='salary']");
			public final static By Department= By.xpath("//input[@id='department']");
			public final static By btnSubmit=By.xpath("//button[@id='submit']");		
	}


