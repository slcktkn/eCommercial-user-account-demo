package eCommercialDemo.business.concrete;

import java.util.List;

import eCommercialDemo.business.abstracts.UserService;
import eCommercialDemo.dataAccess.abstracts.UserDao;
import eCommercialDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao _userDao;

	public UserManager(UserDao userDao) {
		super();
		_userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		_userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		_userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		_userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return _userDao.getAll();
		
	}

	@Override
	public User getById(int id) {
		
		return _userDao.getById(id);
	}
	
	@Override
	public User getByMail(String email) {
		
		return _userDao.getByMail(email);
	}
	
	
	private boolean checkIfUserExists(String email) {
		
		var result = _userDao.getByMail(email);
		if (result !=null) {
			System.out.println("User exists");
			return false;
		}
			return true;
		
	}
private boolean checkIfEmailIsValid(String email){
		
		var result = _userDao.getByMail(email);
		if ((email.matches("(?simx)\\b[A-Z0-9._%+-]+" + "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b"))) {
			System.out.println(email+" email address");
			
		}else {
		System.out.println(email+" invalid email address");		
		}
		return false;
	}

private boolean checkIfFirstNameLastNameCharactersMoreThanTwo(String firstName,String lastName) {
	
	if(firstName.length()<2 &&lastName.length()<2) {
		System.out.println("Please enter more charactes");
		return false;
	}else {
		System.out.println("Succeed");
		return true;
	}
}

@Override
public boolean AccountVerify(User User) {
	var result = _userDao.AccountVerify(User);
	if (result) {
		return true;
	}
	return false;
}



}
