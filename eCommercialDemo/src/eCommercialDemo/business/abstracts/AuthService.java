package eCommercialDemo.business.abstracts;

public interface AuthService {
	
	public void register(int id, String firstName, String lastName, String email, String password);

	public void login(String email,String password);
	

}
