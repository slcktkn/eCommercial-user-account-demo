package eCommercialDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommercialDemo.dataAccess.abstracts.UserDao;
import eCommercialDemo.entities.concretes.User;

public class UserDaoManager implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
		System.out.println("user added: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.get(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setEmail(user.getEmail());
		
		System.out.println("user updated: "+userToUpdate.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		
		users.remove(user.getId());
		users.removeIf(u->u.getId()==user.getId());
		
		System.out.println("user deleted with id: "+user.getId());
		
	}

	@Override
	public List<User> getAll() {
		
		
		System.out.println("user was listed: ");
		return users;
	}

	@Override
	public User getById(int id) {
		
		for (User user:users) {
			if(user.getId()==id) {
				return user;
			}
			
		}		
		//User user = users.get(id);
		return null;
	}
	
	@Override
	public User getByMail(String email){
		for (User user:users) {
			if(user.getEmail()==email) {
				return user;
			}
			
		}		
		//User user = users.get(id);
		return null;
	}
	@Override
	public boolean AccountVerify(User user) {
		System.out.println("Account verified"+user);
		return true;
	}
	
}
