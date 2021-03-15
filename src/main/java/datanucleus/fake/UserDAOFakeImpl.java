package datanucleus.fake;

import datanucleus.dao.User;
import datanucleus.dao.UserDAO;

public class UserDAOFakeImpl implements UserDAO {

	@Override
	public User getUser(int id) {
		System.out.println("getuser with id");
		return null;
	}

	@Override
	public void newUser(boolean pilot) {
		System.out.println("new user pilot or not");

	}

}
