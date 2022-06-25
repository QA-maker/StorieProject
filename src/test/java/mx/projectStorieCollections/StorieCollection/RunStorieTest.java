package mx.projectStorieCollections.StorieCollection;

import org.junit.After;
import org.junit.Test;

public class RunStorieTest extends TestParameters {
		
		@Test
		
		public void RunTestExample() throws Exception {
			driver.navigate().to(mx.projectStorieComponents.StorieComponnents.urlDemo);
			Thread.sleep(10000);
			//homepage.TypeText();
			//homepage.clickButton();
			homepage.getListName();
			
		}
		@After
		public void after() {
			driver.quit();
		}

}
