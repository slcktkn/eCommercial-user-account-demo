package eCommercialDemo.core;

import eCommercialDemo.entities.concretes.User;
import eCommercialDemo.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements AccountService{
	
	GoogleAccountManager accountManager = new GoogleAccountManager();

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
		
	//@Override
	//public void createAccount(User user) {
		
		//accountManager.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		
		//System.out.println("registered: "+user.getFirstName());
		
		//accountManager.login(user.getEmail(),user.getPassword() );
		
		//System.out.println("logged in: "+user.getFirstName());
		
	}

