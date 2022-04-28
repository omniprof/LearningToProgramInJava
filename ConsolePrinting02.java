/**
 * Example of using concatenation to combine a string and a primitive variable
 * 
 * @author Ken Fogel
 */
public class ConsolePrinting02 {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		int moosePopulation = 1000000;
		System.out.println("There are as many as " + moosePopulation + " in Canada.");
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var consolePrinting02 = new ConsolePrinting02();
		consolePrinting02.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

