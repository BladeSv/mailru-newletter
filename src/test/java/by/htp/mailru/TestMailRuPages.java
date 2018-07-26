package by.htp.mailru;

import by.htp.mailru.driver.WorkDriver;
import by.htp.mailru.pages.LoginPage;
import by.htp.mailru.pages.MainMailPage;
import by.htp.mailru.steps.Steps;

public class TestMailRuPages {

	public static void main(String[] args) {
		//loginPage.Login("tathtp", "Klopik123");
		
		
		Steps steps =new Steps();
		
		steps.LoginMailRu("tathtp", "Klopik123");
		steps.CreateNewLetter();
		
	}
	
	
}
