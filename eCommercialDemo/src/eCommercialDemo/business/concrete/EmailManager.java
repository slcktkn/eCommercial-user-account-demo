package eCommercialDemo.business.concrete;

import eCommercialDemo.business.abstracts.EmailService;
import eCommercialDemo.entities.concretes.User;

public class EmailManager implements EmailService {


	@Override
	public void sendSuccessful(String email, String to) {
		
		System.out.println("Successfull.Email was sent from: "+email+ " to " +to);
	}

	@Override
	public void sendFailed(String email, String to) {
		System.out.println("Failed.Email was sent from : "+email+ " to " +to);
		
	}

	

}
