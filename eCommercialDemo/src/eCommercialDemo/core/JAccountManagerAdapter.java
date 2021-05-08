package eCommercialDemo.core;

import eCommercialDemo.JAccount.JAccountManager;
import eCommercialDemo.entities.concretes.User;

public class JAccountManagerAdapter implements AccountService{
	
	JAccountManager accountManager = new JAccountManager();
		
	@Override
	public void createAccount(User user) {
		
		accountManager.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		
		System.out.println("registered: "+user.getFirstName());
		
		accountManager.login(user.getEmail(),user.getPassword() );
		
		System.out.println("logged in: "+user.getFirstName());
		
	}



}
