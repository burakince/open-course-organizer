package tr.org.linux.opencourseorganizer.client;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenCourseOrganizerTestInt {

	private static WebDriver driver;

	@BeforeClass
	public static void setUpOnce() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/burak/WebDrivers/chromedriver_linux64_2.2/chromedriver");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String gwtDevPluginPath = "--load-plugin=/home/burak/.config/chromium/Default/Extensions/jpjpnpmbddbjkfaccnmhnkdgjideieim/1.0.11357_0/Linux_x86_64-gcc3/libGwtDevPlugin.so";
		capabilities.setCapability("chrome.switches", Arrays.asList(gwtDevPluginPath));

		driver = new ChromeDriver(capabilities);
	}

	@Before
	public void setUp() throws Exception {
		driver.get("http://127.0.0.1:8888/OpenCourseOrganizer.html?gwt.codesvr=127.0.0.1:9997");
	}

	@Test
	public void countHomePageLabels() throws Exception {
		List<WebElement> labels = driver.findElements(By.className("gwt-Label"));
		assertEquals(5, labels.size());
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@AfterClass
	public static void tearDownOnce() throws Exception {
		driver.quit();
	}

}
