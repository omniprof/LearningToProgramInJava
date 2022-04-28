/**
 * Example of a mathematical calculation for which math precedence of operators 
 * delivers the wrong answer
 * 
 * @author Ken Fogel
 */
public class DoingMath {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
	
		double value01 = 14.0;
		double value02 = 7.9;
		double value03 = 12.56;
		double average;
	
		average = (value01 + value02 + value03) / 3.0;
		
		System.out.println("Average of three numbers is = " + average);
	}
	
    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var doingMath = new DoingMath();
		doingMath.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/
