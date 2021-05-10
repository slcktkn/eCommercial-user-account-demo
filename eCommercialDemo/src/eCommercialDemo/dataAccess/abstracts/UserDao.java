package eCommercialDemo.dataAccess.abstracts;

import java.util.List;

import eCommercialDemo.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	User getById(int id);
	User getByMail(String email);
	public User getByMailAndPassword(String email, String password);
	

}
