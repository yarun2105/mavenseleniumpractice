package DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserUtil {

	private WebDriver driver;
	
	
	// Launch browser gneric method

	public WebDriver launchBrowser(String browser) {
		System.out.println("Browser name:" + browser);

		switch (browser.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Safari":
			
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		

		default:
			System.out.println("Please provide the right browser");
			break;

		}
		return driver;
	}

	// open url method for generic

	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLNULLEXCEPTION");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		if (url.indexOf("http") != 0 || url.indexOf("https") != 0) {
			System.out.println("http(s) is missing");
			throw new Exception("HTTP(S)EXCEPTION");
		}

		driver.get(url);
	}

	// getpageTitle method

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is:" + title);
		if (title != null) {
			return title;

		} else {
			System.out.println("getting null title");
			return null;
		}
	}

	// getcurrent page url method for generic

	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Current url is :" + url);
		if (url != null) {
			return url;
		} else {
			System.out.println("url is null");
			return null;
		}

	}

	// close browser method for generic

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is close");
		}

	}

	// Quit browser method for generic

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("Broswe is quit");
		}
	}

}
