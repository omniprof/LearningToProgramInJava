import java.util.Scanner;

/**
 * Example of using a method for user input that accepts as a parameter the 
 * prompt to be presented to the user.
 * 
 * @author Ken Fogel
 */
public class ScannerLoopTest03 {
 
	private Scanner sc; // Class/instance variable
	
    /**
     * Constructor
	 * Instantiates the Scanner object
     */
	public ScannerLoopTest03() {
	   sc = new Scanner(System.in);
	}
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		double useDoubleValue = retrieveDouble("Enter your age:");
		System.out.println("The value return is: " + useDoubleValue);

		double useAnotherDoubleValue = retrieveDouble("Enter your weight:");
		System.out.println("The value return is: " + useAnotherDoubleValue);
	}
	
    /**
     * Method to display a prompt and accept input that can be converted into a double.
	 * If it cannot be converted then you will be asked over and over to re-enter until 
	 * you enter a string that can be converted into a double.
	 *
     * @param prompt String to display
     * @return Value entered by the user
     */
	private double retrieveDouble(String prompt) {
		boolean validInput = false;
		double doubleValue = 0.0;
		do {
			System.out.println(prompt);
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
		var scannerLoopTest03 = new ScannerLoopTest03();
		scannerLoopTest03.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *  
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 * 
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

