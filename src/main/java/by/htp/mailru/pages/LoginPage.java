package by.htp.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	 public LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	 
	 public void openPage() {
		 
		 driver.get("https://account.mail.ru/login");
	
		
		 
	 }
	 public  void Login(String login, String pass) {
	
		 WebElement loginElement =driver.findElement(By.name("Login"));	
		 loginElement.sendKeys(login);
		 WebElement passElement =driver.findElement(By.name("Password"));	
		 passElement.sendKeys(pass);
		 loginElement.submit();
	 }

	 
	 
}
