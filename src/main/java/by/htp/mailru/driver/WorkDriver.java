package by.htp.mailru.driver;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkDriver {
	private static WebDriver driver;
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH="src\\main\\resources\\chromedriver\\chromedriver.exe";

	
	
	private WorkDriver() {};
	
	public static WebDriver getDriver()  {
		if(driver==null) {
			System.setProperty(CHROME, CHROME_PATH);
			 driver= new ChromeDriver();
			driver.manage().window().maximize();
					
		}
			
		
		return driver;
				
	}
	
	public static void closeDriver() {
		driver.close();
		driver=null;
		
	}

}
