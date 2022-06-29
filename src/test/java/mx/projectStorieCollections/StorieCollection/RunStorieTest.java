package mx.projectStorieCollections.StorieCollection;

import org.junit.After;
import org.junit.Test;

public class RunStorieTest extends TestParameters {
		
		@Test
		
		public void RunTestExample() throws Exception {
			driver.navigate().to(mx.projectStorieComponents.StorieComponnents.urlProject);
			Thread.sleep(35000);
			homepage.TypeText();
			/*homepage.addRegister();
			Thread.sleep(5000);
			homepage.EnterFormat();
			Thread.sleep(5000);*/
			/*homepage.EnterAge();
						homepage.EnterLastName();
			
			homepage.EnterMail();
				homepage.EnterSalary();
			
			homepage.EnterDepartment();
			
			homepage.btnsubmit();*/
			//Thread.sleep(mx.projectStorieComponents.StorieComponnents.stopMediumTimeMilliseconds);
			//homepage.getListName();
			homepage.scrollTable();
			homepage.gewtListCourses();
			
		}
		@After
		public void after() {
			driver.close();
		
		}

}
