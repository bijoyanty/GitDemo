package TAS.MavenJAVA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumWebTest {
	private static Logger log = LogManager.getLogger(SeleniumWebTest.class.getName());
	
	ExtentReports report;
	@BeforeTest
	public void ait() {
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter extent = new ExtentSparkReporter (path);
		
		extent.config().setDocumentTitle("Web Automation report");
		
		report =new ExtentReports();
		report.attachReporter(extent);
		
		
	}
	
	@Test
	public void st() {
		
		ExtentTest test= report.createTest("Initial Demo");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ID041811\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		log.debug("Automation test started");
		
		log.error("This is a error");
		log.info("The test is ended");
		
		test.fail("Result do not match");
		
		
		driver.close();
		report.flush();
	}

}
