package pomHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomHome {

	public WebDriver driver = null;
	public String firstName = "fname";
	public String lastName = "lname";

	public pomHome(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getFirstName() {
		WebElement element;
		element = driver.findElement(By.id(firstName));
		return element;
	}

	private WebElement getLastName() {
		WebElement element;
		element = driver.findElement(By.id(lastName));
		return element;
	}

	public void sendFirstName(String data) {
		try {
			getFirstName().sendKeys(data);
Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void sendLastName(String data) {
		try {
			getLastName().sendKeys(data);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
