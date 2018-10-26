import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	WebDriver driver;
	
	@BeforeTest
	public void TestChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\NPN\\NPN Training - Selenium Architect Training\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void TestGoogle() {
		driver.get("https://google.com");
	}
	@Test
	public void TestFacebook() {
		driver.get("https://facebook.com");
	}
	@Test
	public void TestNPN() {
		driver.get("https://npntraining.com");
	}

}
