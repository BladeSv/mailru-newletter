package by.htp.mailru;

import by.htp.mailru.driver.WorkDriver;
import by.htp.mailru.pages.LoginPage;
import by.htp.mailru.pages.MainMailPage;

public class TestMailRuPages {

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage(WorkDriver.getDriver());
	
		loginPage.openPage();
		loginPage.Login("tathtp", "Klopik123");
		
		MainMailPage mainMailPage =new MainMailPage(WorkDriver.getDriver());
		mainMailPage.openPage();
	}
	
	
}
