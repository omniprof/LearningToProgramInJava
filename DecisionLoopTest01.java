/**
 * Example of boolean expressions
 * 
 * @author Ken Fogel
 */
public class DecisionLoopTest01 {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		
		// Comparison operators
		int x = 4;
		int y = 6;
		System.out.println(x + " == " + y + ": " + (x == y));
		System.out.println(x + " > " + y + ": " + (x > y));
		System.out.println(x + " < " + y + ": " + (x < y));
		System.out.println(x + " >= " + y + ": " + (x >= y));
		System.out.println(x + " <= " + y + ": " + (x <= y));
		
		// Logical Operators
		int z = 5;
		System.out.println("(" + z + " > " + x + " && " + z + " < " + y +"): " + (z > x && z < y));
		z = 8;
		System.out.println("(" + z + " < " + x + " || " + z + " > " + y +"): " + (z < x || z > y));
	}

    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var decisionLoopTest01 = new DecisionLoopTest01();
		decisionLoopTest01.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

