package testbase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.EnterVehicalDataPageObjects;
import pageObject.HomePageObjects;
import reusableComponents.LogUtil;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectRepo{



	public void LaunchBrowserAndNavigate() throws Exception{

		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		LogUtil.info("Browser is implemented");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get(url);
	}

	@BeforeMethod
	public void setupMethod() throws Exception {
		LaunchBrowserAndNavigate();
		homepage = new HomePageObjects();
		vehData = new EnterVehicalDataPageObjects();
	}

	@AfterMethod
	public void cleanUP() {
		driver.quit();
	}
}





















