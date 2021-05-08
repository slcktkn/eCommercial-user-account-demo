package eCommercialDemo.core;

import eCommercialDemo.entities.concretes.User;

public interface AccountService {
	
	//void register(String firstName, String lastName, String email, String password);
	void createAccount(User user);
	//void login(String email,String password);

}
