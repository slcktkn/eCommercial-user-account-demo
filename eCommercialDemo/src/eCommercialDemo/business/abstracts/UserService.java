package eCommercialDemo.business.abstracts;

import java.util.List;

import eCommercialDemo.entities.concretes.User;

public interface UserService {

	void add(User user);

	void update(User user);

	void delete(User user);

	List<User> getAll();

	User getById(int id);

	User getByMail(String email);

	User getByMailAndPassword(String email, String password);

}
