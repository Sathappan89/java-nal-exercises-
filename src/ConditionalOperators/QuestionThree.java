package ConditionalOperators;

public class QuestionThree {
	/*
	 * Write a Java program to test a number is positive or negative. Test Data
	 * Input number: 35 -- positive number Input number: -11 -- negative number
	 */
	public static void main(String[] args) {

		int Number = Integer.parseInt(args[0]);

		if (Number >= 0) {
			System.out.println("Input number : " + Number + " Positive number");
		} else {
			System.out.println("Input number : " + Number + " Negative number");
		}

	}

}
