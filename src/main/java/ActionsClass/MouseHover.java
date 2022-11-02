package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.id("input"));
		act.sendKeys(ele, "milk").build().perform();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.id("input"));

//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[@qa='categoryDD']"))).build().perform();
//		act.moveToElement(driver.findElement(By.linkText("Bakery, Cakes & Dairy"))).build().perform();
//		act.moveToElement(driver.findElement(By.linkText("Dairy"))).build().perform();
//		act.moveToElement(driver.findElement(By.linkText("Milk"))).click().build().perform();
//		
//		By parent = By.xpath("//a[@qa='categoryDD']");
//		By child1 = By.linkText("Bakery, Cakes & Dairy");
//		By child2 = By.linkText("Dairy");
//		By child3 = By.linkText("Milk");
//		
//		moveToElementLevel4(parent,child1,child2,child3);
//
//	}
	
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
	
	
//	public static WebElement getElementWithWait(By locator) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//	
//	public static void doClick(By locator) {
//		getElementWithWait(locator).click();
//	}
//	
//	
//	public static void moveToElementLevel4(By parentLocator, By child1Locator, By child2Locator, By child3Locator) {
//		Actions act = new Actions(driver);
//		act.moveToElement(getElementWithWait(parentLocator)).build().perform();
//		act.moveToElement(getElementWithWait(child1Locator)).build().perform();
//		act.moveToElement(getElementWithWait(child2Locator)).build().perform();
//		doClick(child3Locator);
//		//act.moveToElement(getElement(child3Locator)).click().build().perform();
//		
//	}
//	
	}
}
