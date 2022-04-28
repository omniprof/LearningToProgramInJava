import java.util.Scanner;

/**
 * Example of using a method to retrieve a double value from the user.
 * There is an error in this code. The keyboard buffer is not cleared
 * when the input is invalid. The program will go into an endless loop
 * never asking for new input once you enter an invalid string.
 * 
 * @author Ken Fogel
 */
public class ScannerLoopTest01 {
 
	private Scanner sc; // Class/instance variable
	
    /**
     * Constructor
	 * Instantiates the Scanner object
     */
	public ScannerLoopTest01() {
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
		} while(!validInput);
		
		return doubleValue;
	}
		
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var scannerLoopTest01 = new ScannerLoopTest01();
		scannerLoopTest01.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

