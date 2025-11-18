package ConditionalOperators;

import java.util.Scanner;

public class QuestionEight {
	/*
	 * WAP to define the interest rate on the basis of Loan type using Switch Case
	 * a. Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan 
	 * i. For Housing Loan, if user’s salary is less than 35000 USD - print : NOT
	 * APPLICABLE FOR Housing Loan
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String LoanType = sc.nextLine();
		double salary = 30000;
		double interestRate = 0.0;
		
		switch (LoanType.toLowerCase().trim()) {
		case "car laon":
			System.out.println("Execute in car");
			break;
		case "housing loan":	
			if(salary<35000) {
				System.out.println("Not Applicable For Housing Loan");
			}
			break;
		case "personal loan":
			System.out.println("Execute in personal");
			break;
		case "education loan":
			System.out.println("Execute in education");
			break;
		default:
			System.out.println("Please pass the wrong browser");
			break;
		}

	}

}
