package datanucleus.dao.dn;

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
	public void newUser(boolean pilot) {
		// TODO Auto-generated method stub

	}

}
