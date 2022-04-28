import java.util.Scanner;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Final version of the loan payment calculator
 * 
 * @author Ken Fogel
 */
public class LoanPresentation01 {
    
	// Class or instance variables available to all methods in the class only
    private double presentValue;
    private double annualPercentageRate;
    private double term;
    private double payment;
    private Scanner sc;
	private LoanBusiness loanBusiness;
    
    /**
     * Constructor
	 * Instantiates the Scanner and LoanBusiness objects
     */
    public LoanPresentation01() {
        sc = new Scanner(System.in);
		loanBusiness = new LoanBusiness();
    }
    
    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
    public void perform() {
        presentValue = retrieveDouble("Please enter the amount of the loan: ");
        annualPercentageRate = retrieveDouble("Please enter the annual percentage rate: ");
        term = retrieveDouble("Please enter the years to repay the loan: ");
		payment = loanBusiness.calculateLoanPayment(presentValue, annualPercentageRate, term);
		displayResult();
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
	 * Method to display the result of the calculation rounded and formatted
	 *
	 */
	private void displayResult() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setRoundingMode(RoundingMode.HALF_EVEN);
		System.out.println("The monthly payment is = " + nf.format(payment));
	}		

    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
    public static void main(String[] args) {
        var loanPresentation01 = new LoanPresentation01();
        loanPresentation01.perform();
    }
}

/**
 * Business class with a method to calculate the loan payment.
 *
 */
public class LoanBusiness {
	
    /**
     * Method that receives the three values required to calculate loan payments, 
	 * calculates the payment, and returns it.
	 *
     * @param presentValue Amount of money being borrowed
     * @param annualPercentageRate Annual interest rate
     * @param term Length of loan in years
     * @return Loan payment
     */
	public double calculateLoanPayment(double presentValue, double annualPercentageRate, double annualPercentageRate) {
		double monthlyPercentageRate = annualPercentageRate / 12.0;
		double monthlyTerm = term * 12.0;
		
		double divisor = 1 - Math.pow(1+monthlyPercentageRate, -monthlyTerm);
		
		double payment = presentValue * monthlyPercentageRate / divisor;
		
		return payment;
	}
}

/***********************************************************************
 * This work is licensed under the Creative Commons Attribution 4.0    *
 * International License. To view a copy of this license,              *  
 * visit http://creativecommons.org/licenses/by/4.0/                   *
 * or send a letter to                                                 * 
 * Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.        *
 ***********************************************************************/



