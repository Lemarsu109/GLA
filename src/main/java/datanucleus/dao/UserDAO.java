package datanucleus.dao;

public interface UserDAO{

    /**
     * @param id the user id
     * @return the user with the wanted id
     */
    User getUser(int id);

    /**
     * @param pilot if the new user is a pilot or not
     * Creates a new User
     * @return 
     */
  	User newUser(boolean pilot);

}