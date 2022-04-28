import java.util.Scanner;
/**
 * Example of using the Scanner object to receive user input from the keyboard
 * 
 * @author Ken Fogel
 */
public class ConsoleInput {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
    public void perform() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integerInput = sc.nextInt();
        System.out.println("The integer is " + integerInput);
    }

    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
    public static void main(String[] args) {
        var ConsoleInput = new ConsoleInput();
        ConsoleInput.perform();
    }
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/
