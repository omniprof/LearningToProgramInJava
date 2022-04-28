import java.util.Scanner;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * Loan payment calculator that uses a separate method for each input. There is no
 * error checking for invalid strings.
 * 
 * @author Ken Fogel
 */
public class LoanPresentation {
    
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
    public LoanPresentation() {
        sc = new Scanner(System.in);
		loanBusiness = new LoanBusiness();
    }
    
	/**
	 * Request the amount of the loan. If the string entered cannot be converted 
	 * to a double then exceptions will be thrown
	 */
    private void inputPresentValue() {
        System.out.println("Please enter the amount of the loan: ");
        presentValue = sc.nextDouble();
    }

	/**
	 * Request the annual interest rate of the loan. If the string entered cannot be 
	 * converted to a double then exceptions will be thrown
	 */
    private void inputAnnualPercentageRate() {
        System.out.println("Please enter the annual percentage rate: ");
        annualPercentageRate = sc.nextDouble();
    }
    
	/**
	 * Request the term/length of the loan. If the string entered cannot be 
	 * converted to a double then exceptions will be thrown
	 */
    private void inputTerm() {
        System.out.println("Please enter the years to repay the loan: ");
        term = sc.nextDouble();
    }
	
    /**
	 * Method to display the result of the calculation rounded and formatted
	 *
	 */
	private void displayResult() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setRoundingMode(RoundingMode.HALF_EVEN);
		System.out.println("The rounded monthly payment is = " + nf.format(payment));
	}		

    /**
	 * This method is where the program begins doing useful work. You can name it anything 
	 * you want but by convention it should be a verb.
	 */
    public void perform() {
        inputPresentValue();
        inputAnnualPercentageRate();
        inputTerm();
		payment = loanBusiness.calculateLoanPayment(presentValue, annualPercentageRate, term);
		displayResult();
    }

    /**
     * Where the program begins
     *
     * @param args Command line arguments, not used in this program
     */
    public static void main(String[] args) {
        var loanPresentation = new LoanPresentation();
        loanPresentation.perform();
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
	public double calculateLoanPayment(double presentValue, double annualPercentageRate, double term) {
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


