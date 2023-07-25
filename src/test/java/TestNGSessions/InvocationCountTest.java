package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(invocationCount=10)
	public void numGenTest() {
		
		int i=0;
		i+=1;
		System.out.println(i);
	}
	
}
