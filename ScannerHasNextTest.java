import java.util.Scanner;

/**
 * Example of using the Scanner hasNextDouble method to validate that the input string 
 * can be converted into a double
 * 
 * @author Ken Fogel
 */
public class ScannerHasNextTest {
 
	private Scanner sc; // Class/instance variable
	
    /**
     * Constructor
	 * Instantiates the Scanner object
     */
	public ScannerHasNextTest() {
	   sc = new Scanner(System.in);
	}
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		double doubleValue = 0.0;
		System.out.println("Please enter a number: ");
		if (sc.hasNextDouble()) {
			doubleValue = sc.nextDouble();
			System.out.println("You entered " + doubleValue);
		} else {
			System.out.println("Invalid input.");
		}
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var scannerHasNextTest = new ScannerHasNextTest();
		scannerHasNextTest.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/
