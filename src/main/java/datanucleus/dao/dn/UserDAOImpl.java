package datanucleus.dao.dn;

import javax.jdo.PersistenceManagerFactory;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;


import datanucleus.dao.User;
import datanucleus.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	private PersistenceManagerFactory pmf;

	public UserDAOImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}
	
	@Override
	public User getUser(String email, String password) {
		User user = null;
		User detached = new User();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("String email");
			q.declareParameters("String password");
			q.setFilter("email == user.email");
			q.setFilter("password == user.password");

			user = (User) q.execute(email);
			detached = (User) pm.detachCopy(user);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}
	
	@Override
	public User getUser(String id) {
		User user = null;
		User detached = new User();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(User.class);
			q.declareParameters("String id");
			q.setFilter("String == user.id");

			user = (User) q.execute(id);
			detached = (User) pm.detachCopy(user);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

}
