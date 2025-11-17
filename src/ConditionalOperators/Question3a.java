package ConditionalOperators;

public class Question3a {
	/** WAP to check number is odd or even using If - Else */
	public static void main(String[] args) {
		
		int CheckNumber = Integer.parseInt(args[0]);
		
		if(CheckNumber%2==0) {
			System.out.println(CheckNumber + " is a even number");
		}
		else {
			System.out.println(CheckNumber + " is a Odd number");
		}

	}

}
