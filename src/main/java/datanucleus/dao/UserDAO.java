package datanucleus.dao;

public interface UserDAO{

    /**
     * @param email the user's email
	 * @param password the user's password
     * @return the user with the wanted id
     */
	User getUser(String email, String password);
	
	/**
     * @param id the user's id
     * @return the user with the wanted id
     */
	User getUser(String id);

}