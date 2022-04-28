/**
 * Example of the mod % operator with a circular number
 * 
 * @author Ken Fogel
 */
public class DoingMath {
	
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {
	
		int currentHour = 4;
		int hoursToAdd = 14;
		int clockHours = 12;
		int newTime;
		
		newTime = (currentHour + hoursToAdd) % clockHours;
		
		System.out.println("The new hours is = " + newTime);
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
