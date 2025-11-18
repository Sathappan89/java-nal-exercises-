package ShortCirucuitandLogicalOperatorAssignments;

public class observetheOutput {

	/*
	 * Run the code and observe the output. Change the values of x and y to see how
	 * the combined conditions affect the result.
	 */
	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		if (x > 0 && y > 0 && x < y && x * 2 < y) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Fail");
		}

	}

}
