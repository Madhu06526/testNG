package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void searchTest() {	
		
		boolean flag =driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test
	public void titleTest() {
		
		String title=driver.getTitle();
		System.out.println("Title:"+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
