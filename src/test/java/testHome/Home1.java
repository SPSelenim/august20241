package testHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.pomHome;

public class Home1 {
	public WebDriver driver = null;

	@BeforeSuite
	public void tearSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		System.out.println("====Home Launched========");
		
	}

	@Test
	public void f() {
		try {
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	@Test
	public void f1() {
		try {
		pomHome home=new pomHome(driver);
				home.sendFirstName("SS");
				home.sendLastName("pp");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
