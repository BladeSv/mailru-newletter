package by.htp.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMailPage {

	private WebDriver driver;
	
	 public MainMailPage(WebDriver driver){
		
		this.driver=driver;
	}
	 
	 public void openPage() {
		 driver.get("https://e.mail.ru/messages/inbox"); 
		 
		 
	 }
	 
	 public void createNewLetter() {
		WebElement element = driver.findElement(By.xpath("[@id=\'b-toolbar__left\']/div/div/div[2]/div/a")) ;
		 
		 
	 }
	
	
	
	
}
