package eCommercialDemo.googleAccount;

public class GoogleAccountManager {

	public void register(String firstName, String lastName, String email, String password) {
		System.out.println("Google Account registered: " + email);
	}

	public void login(String email, String password) {

		System.out.println("Google Account loggedOn: " + email);
	}
}
