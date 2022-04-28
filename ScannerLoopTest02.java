import java.util.Scanner;

/**
 * Example of accepting user input and verifying that it can be converted to a primitive type
 * otherwise it keeps asking you to re-enter the value.
 * 
 * @author Ken Fogel
 */
public class ScannerLoopTest02 {
 
	private Scanner sc; // Class/instance variable
	
    /**
     * Constructor
	 * Instantiates the Scanner object
     */
	public ScannerLoopTest02() {
	   sc = new Scanner(System.in);
	}
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		double useDoubleValue = retrieveDouble();
		System.out.println("The value return is: " + useDoubleValue);
	}
	
    /**
     * Get user input and validate that it can be a double. If it cannot then repeat the 
	 * request for input until a valid string is entered
	 *
     * @return The value entered by the user
     */
	private double retrieveDouble() {
		boolean validInput = false;
		double doubleValue = 0.0;
		do {
			System.out.println("Please enter a number: ");
			if (sc.hasNextDouble()) {
				doubleValue = sc.nextDouble();
				validInput = true;
			} else {
				System.out.println("Invalid input.");
			}
			sc.nextLine();
		} while(!validInput);
		
		return doubleValue;
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var scannerLoopTest02 = new ScannerLoopTest02();
		scannerLoopTest02.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *  
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 * 
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

