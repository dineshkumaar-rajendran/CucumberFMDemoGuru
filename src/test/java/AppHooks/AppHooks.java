package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.driverfactory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	private Properties prop;
	private DriverFactory Dfact;
	private ConfigReader configR;
	private WebDriver driver;

	@Before(order = 0)
	public void get_propert() {
		configR = new ConfigReader();
		prop = configR.get_prop();
	}

	@Before(order = 1)
	public void start_browser() {
		String browsername = prop.getProperty("browser");
		Dfact = new DriverFactory();
		driver = Dfact.init_driver(browsername);

	}

	@After(order = 0)
	public void close_browser() {
		Dfact.getDriver().quit();
	}

	@After(order = 1)
	public void takeScreenshot(Scenario scenario) {
		String ScreenshotName = scenario.getName().replaceAll(" ", "_");
		byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "Image/jpeg", ScreenshotName);

	}

}
