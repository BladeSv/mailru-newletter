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
	driver.switchTo().frame("toolkit-153269808315041composeEditor_tbl");

	WebElement adressArea= driver.findElement(By.xpath("//div[@data-bem='compose-head']//textarea[@data-original-name='To']"));
	adressArea.sendKeys(adress);
WebElement theameArea = driver.findElement(By.xpath("//div[@data-bem='compose-head']//input[@data-bem='b-input']"));
theameArea.sendKeys(theame);



//WebElement messegeArea = driver.findElement(By.xpath("//body[@id='tinymce']"));
	
//messegeArea.sendKeys(messege);
	
	};
	
	//*[@id="toolkit-153269894305341composeForm"]/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input
	
	
}
