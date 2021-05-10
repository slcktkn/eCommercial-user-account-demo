package eCommercialDemo.business.concrete;

import java.util.List;

import eCommercialDemo.business.abstracts.UserService;
import eCommercialDemo.dataAccess.abstracts.UserDao;
import eCommercialDemo.entities.concretes.User;
import eCommercialDemo.utils.BusinessRules;

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

	@Override
	public User getByMailAndPassword(String email, String password) {

		return _userDao.getByMailAndPassword(email, password);

	}

}
