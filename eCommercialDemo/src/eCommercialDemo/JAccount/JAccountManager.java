package eCommercialDemo.JAccount;

import eCommercialDemo.entities.concretes.User;

public class JAccountManager {
	
	public void register(String firstName, String lastName, String email, String password) {
		System.out.println("Account registered: "+email);
	}

	public void login(String email,String password){
		
		System.out.println("Account loggedOn: "+email);
	}

}
