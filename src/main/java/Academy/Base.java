package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initializeBrowser() throws IOException {

		Properties prop = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\ID041811\\E2EFrameWork\\E2EPROJECT\\src\\main\\java\\Academy\\data.properties");

		prop.load(file);
		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome") ) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ID041811\\drivers\\chromerdriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.contains("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ID041811\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (browserName.contains("IE")) {

			System.setProperty("webdriver.ie.driver", "C:\\Users\\ID041811\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

		return driver;

	}

}
