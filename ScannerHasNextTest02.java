import java.util.Scanner;

/**
 * Example of validating input using the Scanner hasNextDouble method by calling 
 * upon a method just responsible for getting user input. If input is invalid 
 * then a message is displayed and the program ends.
 * 
 * @author Ken Fogel
 */
public class ScannerHasNextTest02 {
 
	private Scanner sc; // Class/instance variable
	
    /**
     * Constructor
	 * Instantiates the Scanner object
     */
	public ScannerHasNextTest02() {
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
     * Get user input and validate that it can be a double. If it cannot then 
	 * display a message and return 0.0
	 *
     * @return The value entered by the user
     */
	private double retrieveDouble() {
		double doubleValue = 0.0;
		System.out.println("Please enter a number: ");
		if (sc.hasNextDouble()) {
			doubleValue = sc.nextDouble();
		} else {
			System.out.println("Invalid input.");
		}
		return doubleValue;
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var scannerHasNextTest02 = new ScannerHasNextTest02();
		scannerHasNextTest02.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

