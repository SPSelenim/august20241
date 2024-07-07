package pomQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomQA {

	public WebDriver driver = null;
	public String QA = "//a[@name='QA']";

	public pomQA(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getQA() {
		WebElement element;
		element = driver.findElement(By.xpath(QA));
		return element;
	}
	public void clickQA() {
		try {
	getQA().click();
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
