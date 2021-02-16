public class User{
    
    public int id;

    public String name;
    public String surname;
    public Date dateOfBirth;
    public String gender;
    public String adress;

    public int phoneNumber;
    public String email;
    public String password;

}

public interface UserDAO{

    /**
     * @param id the user id
     * @return the user with the wanted id
     */
    User getUser(int id);

    /**
     * @param pilot if the new user is a pilot or not
     * Creates a new User
     */
    void newUser(boolean pilot);

}