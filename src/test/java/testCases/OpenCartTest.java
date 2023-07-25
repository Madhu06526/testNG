package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	}
	
	@Test
	public void searchTest() {
		boolean flag =driver.findElement(By.name("search")).isDisplayed();
		System.out.println("flag:"+flag);
		Assert.assertEquals(flag, true);
		
	}
	
	@Test
	public void pageTitleTest() {
		String title=driver.getTitle();
		System.out.println("title: "+title);
		Assert.assertEquals(title,driver.getTitle());
	}

	/*
	 * @Test public void logoTest() {
	 * Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed()
	 * ); }
	 */
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
