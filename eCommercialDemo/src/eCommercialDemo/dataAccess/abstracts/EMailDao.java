package eCommercialDemo.dataAccess.abstracts;

public interface EMailDao {	
	
	boolean checkIfUserExists(String email);
	boolean checkIfEmailInformationTrue(String email);
	boolean checkIfFirstNameLastNameCharactersMoreThanTwo(String firstName,String lastName);
	boolean checkIfPasswordCharactersMoreThanSix(String password);
}
