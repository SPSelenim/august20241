package testClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomHome.pomHome;
import pomQA.pomQA;

public class QA {
	public WebDriver driver = null;

	@BeforeSuite
	public void tearSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		System.out.println("====Application Launched========");
		
	}

	

	@Test
	public void f1() {
		try {
			driver.manage().window().maximize();
			pomQA qa=new pomQA(driver);
			qa.clickQA();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
