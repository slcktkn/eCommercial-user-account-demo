package eCommercialDemo.core;

import eCommercialDemo.JAccount.JAccountManager;
import eCommercialDemo.entities.concretes.User;

public class JAccountManagerAdapter implements AccountService{
	
	JAccountManager accountManager = new JAccountManager();
		
	@Override
	public void register(String firstName, String lastName, String email, String password) {
		
		accountManager.register(firstName, lastName, email, password);
		System.out.println("registered: "+firstName);
	}

	@Override
	public void login(String email, String password) {
		
		accountManager.login(email, password);
		System.out.println("registered: "+email);
		
	}



}
