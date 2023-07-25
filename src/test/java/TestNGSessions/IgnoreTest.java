package TestNGSessions;

import org.testng.annotations.Test;

public class IgnoreTest {
	@Test(description="this is search test method to search for a product")
	public void searchTest() {

	}

	@Test(enabled=true)
	public void addCartTest() {

	}

	@Test(enabled = true,priority= 3, description = "you can give enabled parameter values as true or false")
	public void paymentTest() {

	}
}
