/**
 * Example of calculating the amount to be paid every month for money borrowed
 * 
 * @author Ken Fogel
 */
public class DoingMath {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {

		double presentValue = 5000.0;
		double annualPercentageRate = 0.05;
		double term = 5.0;
		
		double monthlyPercentageRate = annualPercentageRate / 12.0;
		double monthlyTerm = term * 12.0;
		
		double divisor = 1 - Math.pow(1+monthlyPercentageRate, -monthlyTerm);
		
		double payment = presentValue * monthlyPercentageRate / divisor;
		
		System.out.println("The monthly payment is = " + payment);
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

