package datanucleus.dao.fake;

import datanucleus.dao.User;
import datanucleus.dao.UserDAO;

public class UserDAOFakeImpl implements UserDAO {

	@Override
	public User getUser(int id) {
		System.out.println("getuser with id");
		return null;
	}

	@Override
	public User newUser(boolean pilot) {
		System.out.println("new user pilot or not");
		return null;
	}

}
