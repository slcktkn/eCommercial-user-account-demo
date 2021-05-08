package eCommercialDemo.business.concrete;

import eCommercialDemo.business.abstracts.EmailService;
import eCommercialDemo.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void send(String email, String to) {
		System.out.println("Email was sent from :"+email+"to"+to);
		
	}

	

}
