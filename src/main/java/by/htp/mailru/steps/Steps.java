package by.htp.mailru.steps;

import by.htp.mailru.driver.WorkDriver;
import by.htp.mailru.pages.LoginPage;
import by.htp.mailru.pages.MainMailPage;

public class Steps {

	public void LoginMailRu(String login, String pass) {
		
		LoginPage loginPage =new LoginPage(WorkDriver.getDriver());
		loginPage.openPage();
		loginPage.Login(login, pass);
		
	}
	
	
	public void CreateNewLetter() {
		MainMailPage mailPage =new MainMailPage(WorkDriver.getDriver());
		mailPage.openPage();
		mailPage.createNewLetter();
		mailPage.sendNewLetter("bladesvet@gmai.com", "Tema1", "Hello World");
		
		
	}
}
