package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// generic method for findElement & findElements
	
	public  WebElement getElement(By locator) {
		return driver.findElement( locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
}
	
	
	
	

