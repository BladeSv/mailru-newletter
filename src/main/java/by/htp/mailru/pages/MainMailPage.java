package by.htp.mailru.pages;

import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MainMailPage {

	private WebDriver driver;
	
	 public MainMailPage(WebDriver driver){
		
		this.driver=driver;
	}
	 
	 public void openPage() {
		 driver.get("https://e.mail.ru/messages/inbox"); 
		 
		 
	 }
	 
	 public void createNewLetter() {
		WebElement element = driver.findElement(By.cssSelector("#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a")) ;
		//WebElement element = driver.findElement(By.xpath("[@id='b-toolbar__left']/div/div/div[2]/div/a/span")) ;
		 	element.click();
		
	 }
public void sendNewLetter(String adress, String theame, String messege) {
	Set<String> element= driver.getWindowHandles();
	element.forEach(k->System.out.println(k));
	Actions action= new Actions(driver);
	WebElement adressArea= driver.findElement(By.cssSelector("#toolkit-153260965304241composeForm > div:nth-child(1) > div > div.compose-head__content.js-collapsed-off > div.compose-head__row-wrapper.compose-head__row-wrapper_to.js-row > div > div > div:nth-child(2) > div > div > div > textarea.js-input.compose__labels__input"));
	//action.moveToElement(adressArea).click().perform();
	};
	
	
	//driver.switchTo()
//	WebElement element=driver.findElement(By.cssSelector("#toolkit-153260459968041composeForm > div:nth-child(1) > div > div.compose-head__content.js-collapsed-off > div.compose-head__row-wrapper.compose-head__row-wrapper_to.js-row > div > div > div:nth-child(2) > div > div > div > textarea.js-input.compose__labels__input"));
//	element.sendKeys(adress);
	
	
	
}
