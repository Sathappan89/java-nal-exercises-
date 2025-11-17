package ConditionalOperators;

public class QuestionOne {
	/*
	 * Q1.a : Find out the greatest number out of three different given numbers:
	 * Input the 1st number: 25 
	 * Input the 2nd number: 78 
	 * Input the 3rd number: 87
	 * 
	 * Expected Output : The greatest : 87
	 */
	public static void main(String[] args) {

		int firstNumber = 25;
		int secondNumber = 78;
		int thirdNumber = 87;

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("The greatest : " + firstNumber);
		} else if (secondNumber > thirdNumber) {
			System.out.println("The greatest : " + secondNumber);
		} else {
			System.out.println("The greatest : " + thirdNumber);
		}
	}

}
