package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTravio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.trivago.in/");
		
		driver.findElement(By.id("input-auto-complete")).sendKeys("Ranchi");
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/fieldset/div/div[1]/button/span/span"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"calendar-checkin-date\"]")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[3]/div/div/div/div[1]/table/tbody/tr[2]/td[1]/time/button/span"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[2]/button/span/span[1]"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[4]/button[2]/span"))
				.click();

		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(5000);
		String value = driver.findElement(By.xpath("(//p[@data-testid='recommended-price'])[2]")).getText();
		System.out.println(value);

		driver.close();

	}

}
