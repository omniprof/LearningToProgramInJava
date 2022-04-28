/**
 * Declare primitive variables and strings to represent the EnerGuide data and assign 
 * the values. Display the variables after the assignment.
 * 
 * @author Ken Fogel
 */
public class Energuide {

    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
	public void perform() {	
		double averageAnnualOperatingCost = 70.0;
		double lowAverageCost = 10.0;
		double highAverageCost = 100.0;
		double utilityRate = 0.1;
		int hoursOfViewing = 5;
		int screenSize = 42;
		String screenResolution = "HDTV: 720p";
		String brand = "Nom";
		String displayType = "Plasma";
		String modelName = "XxXxxXx";
		int annualEnergyConsumption = 500;
		boolean energyStar = true;
	
		System.out.println("Average Annual Operating Cost: " + averageAnnualOperatingCost);
		System.out.println("Low Average Cost: " + lowAverageCost);
		System.out.println("High Average Cost: " + highAverageCost);
		System.out.println("Utility Rate: " + utilityRate);
		System.out.println("Hours Of Viewing: " + hoursOfViewing);
		System.out.println("Screen Size: " + screenSize);
		System.out.println("Screen Resolution: " + screenResolution);
		System.out.println("Brand: " + brand);
		System.out.println("Display Type: " + displayType);
		System.out.println("Model Name: " + modelName);
		System.out.println("Annual Energy Consumption: " + annualEnergyConsumption);
		System.out.println("EnergyStar: " + energyStar);
	}

    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
	public static void main(String[] args) {
		var energuide = new Energuide();
		energuide.perform();
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 *
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/
