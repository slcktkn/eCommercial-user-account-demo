package eCommercialDemo.business.concrete;

import eCommercialDemo.business.abstracts.AuthService;
import eCommercialDemo.business.abstracts.EmailService;
import eCommercialDemo.business.abstracts.UserService;
import eCommercialDemo.entities.concretes.User;
import eCommercialDemo.utils.BusinessRules;

public class AuthManager implements AuthService {

	private UserService userService;
	private EmailService emailService;
	User user = new User ();
	
	public AuthManager(UserService userService,EmailService emailService) {
		super();
		this.userService = userService;
		this.emailService = emailService;
	
		
	}

	@Override
	public void register(int id,String firstName, String lastName, String email, String password) {
		
		 
		if(BusinessRules.run(!checkIfUserExists(email),
				checkIfFirstNameLastNameCharactersMoreThanTwo(firstName,lastName),
				checkIfPasswordCharactersMoreThanSix(password),
				checkIfEmailIsValid(email)))
		{
			System.out.println("Account registered");
			emailService.sendSuccessful(email,firstName);
			return;
		}else {
			
			emailService.sendFailed(email,firstName);
		}
	}

	@Override
	public void login(String email,String password){
		
		System.out.println("Account loggedOn: "+email);
		
	}
	



private boolean checkIfEmailIsValid(String email){
	
	var result = userService.getByMail(email);
	if ((email.matches("(?simx)\\b[A-Z0-9._%+-]+" + "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b"))) {
		return true;
		
	}else {
	System.out.println(email+" invalid email address");		
	}
	return false;
}


public boolean checkIfUserExists(String email) {
	var result = userService.getByMail(email);
	if (result != null) {
		System.out.println("User exists.Try another mail adress!");
		return true;
	}
		return false;
	
}


public boolean checkIfEmailInformationTrue(String email) {
	// TODO Auto-generated method stub
	return false;
}


public boolean checkIfFirstNameLastNameCharactersMoreThanTwo(String firstName, String lastName) {

if(firstName.length()<2 &&lastName.length()<2) {
	System.out.println("Please enter more charactes");
	return false;
}else {
	return true;
}
}


public boolean checkIfPasswordCharactersMoreThanSix(String password) {
	if(password.length()<6) {
		System.out.println("Password must be more than 6 characters");
		return false;
	}
	return true;
	
}

}
