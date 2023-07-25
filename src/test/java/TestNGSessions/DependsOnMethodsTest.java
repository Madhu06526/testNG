package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
	//Formula Arrange,Act and Assert - AAA

	/* This class demonstrated the feature of 'dependsOnMethods' 
	 * Tests will be skipped, if the method which is creating dependence fails 
	 * Ex: login() is failed then all the dependent tests will be skipped
	 * */
	
	
	@Test
	public void searchItem() {
		System.out.println(" searchItem()");
	}
	
	@Test(dependsOnMethods="login")
	public void addCart() {
		System.out.println("addCart() ");
	}
	
	@Test(dependsOnMethods="login")
	public void payment() {
		System.out.println("payment()");
	}
	
	/*
	 * @Test public void login() { System.out.println("login()");
	 * 
	 * }
	 */
	@Test
	public void login() {
		System.out.println("login()");
		int i=9/0;
		
	}
}
