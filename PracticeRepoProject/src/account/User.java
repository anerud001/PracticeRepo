package account;
import java.util.Date;

/**
 * 
 */

/**
 * A User of our system.
 * 
 * @author Andrew Nerud
 *
 */
public class User {
	
	
	private String username;
	private String password;
	private String name;
	private Date dob;
	
	/**
	 * @param username the user's login name
	 * @param password ....
	 * @param name....
	 * @param dob....
	 */
	public User(String username, String password, String name, Date dob) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.dob = dob;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
