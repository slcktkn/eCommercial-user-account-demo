package eCommercialDemo.business.abstracts;

import eCommercialDemo.entities.concretes.User;

public interface EmailService {
	
	void send (String email, String to);
	

}
