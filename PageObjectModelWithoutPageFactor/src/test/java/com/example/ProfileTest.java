package com.example;

import org.testng.annotations.Test;

public class ProfileTest {
	
	
	
	@Test
	public void testProfile(){
		
	LaunchPage lp=new LaunchPage();
	LoginPage loginpage=	lp.gotoFBHomePage();
	LandingPage landingpage=loginpage.doLogin("UserXXX", "test123");
	ProfilePage profilepage=landingpage.gotoProfilePage();
	profilepage.verifyProfile();
	}

}
