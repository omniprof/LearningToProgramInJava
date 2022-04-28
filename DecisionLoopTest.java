/**
 * Example of if/else logic
 * 
 * @author Ken Fogel
 */
public class DecisionLoopTest {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
		
		int x = 4;
		int y = 6;
		if (x==y) {
			System.out.println(x + " and " + y + " are the equal");
		} else {
			System.out.println(x + " and " + y + " are not equal");
		}
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var decisionLoopTest = new DecisionLoopTest();
		decisionLoopTest.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/

