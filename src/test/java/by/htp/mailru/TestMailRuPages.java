package by.htp.mailru;

import by.htp.mailru.driver.WorkDriver;
import by.htp.mailru.pages.LoginPage;

public class TestMailRuPages {

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage(WorkDriver.getDriver());
	
		loginPage.openPage();
		loginPage.Login("tathtp", "Klopik123");
	}
	
	
}
