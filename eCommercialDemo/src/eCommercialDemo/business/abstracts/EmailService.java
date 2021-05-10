package eCommercialDemo.business.abstracts;


public interface EmailService {
	
	
	void sendSuccessful (String email, String to);
	void sendFailed (String email, String to);
	

}
