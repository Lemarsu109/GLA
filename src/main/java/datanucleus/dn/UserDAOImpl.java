package datanucleus.dn;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import datanucleus.dao.User;
import datanucleus.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	private PersistenceManagerFactory pmf;

	public UserDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public User getUser(int id) {
		return null;
	}

	@Override
	public User newUser(boolean pilot) {
		return null;
		// TODO Auto-generated method stub

	}

}
