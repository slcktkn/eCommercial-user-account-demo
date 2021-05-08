package eCommercialDemo.core;

import eCommercialDemo.entities.concretes.User;
import eCommercialDemo.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements AccountService{
	
	GoogleAccountManager accountManager = new GoogleAccountManager();
		
	@Override
	public void createAccount(User user) {
		
		accountManager.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		
		System.out.println("registered: "+user.getFirstName());
		
		accountManager.login(user.getEmail(),user.getPassword() );
		
		System.out.println("logged in: "+user.getFirstName());
		
	}

}
