/**
 * Example of a decision with if
 * 
 * @author Ken Fogel
 */
public class DecisionLoopTest02 {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		
		int x = 8;
		int y = 6;
		if (x == y) {
			System.out.println(x + " and " + y + " are equal");
		} 
		
		System.out.println("After the if statement's block of code");
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var decisionLoopTest02 = new DecisionLoopTest02();
		decisionLoopTest02.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

