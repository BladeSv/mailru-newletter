package by.htp.mailru.driver;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkDriver {
	private static WebDriver driver;
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH="c:\\Program Files\\Java\\chromedriver.exe";

	
	
	private WorkDriver() {};
	
	public static WebDriver getDriver() {
		if(driver==null) {
			System.getProperty(CHROME, CHROME_PATH);
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
						
		}
			
		
		return driver;
				
	}
	
	public static void closeDriver() {
		driver.close();
		driver=null;
		
	}

}
