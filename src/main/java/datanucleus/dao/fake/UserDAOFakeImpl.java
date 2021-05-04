package datanucleus.dao.fake;

import datanucleus.dao.User;
import datanucleus.dao.UserDAO;

public class UserDAOFakeImpl implements UserDAO {

	@Override
	public User getUser(String email, String password) {
		System.out.println("getuser with email" + email + password);
		return null;
	}
	
	@Override
	public User getUser(String id) {
		System.out.println("getuser with id");
		return null;
	}

}
