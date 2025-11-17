package ConditionalOperators;

public class QuestionTwo {
/*
 * Find out the greatest number out of four different given numbers:
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Input the 4th number: 97
		Expected Output :
		The greatest : 97
 */
	public static void main(String[] args) {
		
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;
		
		if(a>b && a>c && a>d) {
			System.out.println("Input the 1st number: " + a);
		}
		else if(b>c && b>d) {
			System.out.println("Input the 2nd number: " + b);
		}
		else if(c>d) {
			System.out.println("Input the 2nd number: " + c);
		}
		else {
			System.out.println("Input the 2nd number: " + d);
		}

	}

}
