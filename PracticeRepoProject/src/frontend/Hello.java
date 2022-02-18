package frontend;
/**
 * 
 */

import account.User;

/**
 * This is the classic hello world program.
 * 
 * @author Andrew Nerud
 *
 */
public class Hello {

	/**
	 * This is the main method to run.
	 * @param args
	 */
	public static void main(String[] args) {
		User u = new User("anerud", "password", "Andrew Nerud", null);
		System.out.println("Hello, " + u.getName() + "!");

	}

}
