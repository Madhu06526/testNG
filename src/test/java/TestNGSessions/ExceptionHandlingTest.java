package TestNGSessions;

import org.testng.annotations.Test;

public class ExceptionHandlingTest {

	/* We have to handle the exceptions otherwise test execution will be failed,
	 *  we can provide multiple expected exception via parameters*/
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void searchTest() {
		System.out.println("Searchtest()");
		int i=9/0;
		System.out.println("Bye Bye");
		
	}
	
	
}
