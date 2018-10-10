package SeleniumGrid.SeleniumGrid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Grid_Setup {
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
			
		String URL = "http://www.DemoQA.com";
		String Node = "http://172.31.150.43:5555/wd/hub";
		 File file = new File("C:\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
	    cap.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL(Node),cap);
		
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
	}

}