package instagram.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {
	public WebDriver driver;
	
	 public void openApp(String browser, String url) {
		 if (browser.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if (browser.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
		 }
		 else {
			 System.out.println("Chrome is default browser");
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(url);
	 }

		public void closeApp() {
			if (driver != null) {
				driver.quit();
			}
	}}

