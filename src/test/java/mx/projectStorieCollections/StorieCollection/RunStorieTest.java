package mx.projectStorieCollections.StorieCollection;

import org.junit.After;
import org.junit.Test;

public class RunStorieTest extends TestParameters {
		
		@Test
		
		public void RunTestExample() throws Exception {
			driver.navigate().to(mx.projectStorieComponents.StorieComponnents.urlDemo);
			homepage.addRegister();
			Thread.sleep(5000);
			homepage.EnterFormat();
			Thread.sleep(5000);
			homepage.EnterAge();
			Thread.sleep(5000);
			homepage.EnterLastName();
			Thread.sleep(5000);
			homepage.EnterMail();
			Thread.sleep(5000);
			homepage.EnterSalary();
			Thread.sleep(5000);
			homepage.EnterDepartment();
			Thread.sleep(5000);
			homepage.btnsubmit();
			//Thread.sleep(mx.projectStorieComponents.StorieComponnents.stopMediumTimeMilliseconds);
			homepage.getListName();
			
		}
		@After
		public void after() {
			driver.quit();
		}

}
