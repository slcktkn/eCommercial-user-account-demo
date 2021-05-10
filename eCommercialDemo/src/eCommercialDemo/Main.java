package eCommercialDemo;

import eCommercialDemo.business.concrete.AuthManager;
import eCommercialDemo.business.concrete.EmailManager;
import eCommercialDemo.business.concrete.UserManager;
import eCommercialDemo.dataAccess.concretes.UserDaoManager;
import eCommercialDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new UserDaoManager());
		User user1 = new User(1, "Selcuk", "Tekin", "stekin@hotmail.com", "1234");
		userManager.add(user1);

		User user2 = new User(1, "Selcuk", "Tekin", "stekin@gmail.com", "1234");
		userManager.add(user2);

		AuthManager authManager = new AuthManager(userManager, new EmailManager());
		authManager.register(1, "Selcuk", "Tekin", "stekin27@gmail.com", "1234567");
	}

}
