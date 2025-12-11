package StringAssignments;

public class ReverseInt {

	public static int reverse(int num) {

		// convert number to string
		String s = String.valueOf(num);
		String rev = "";

		// reverse using for-loop
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		// convert back to int
		return Integer.parseInt(rev);
	}

	public static void main(String[] args) {
		int[] input = { 56789, 12345 };
		

		for (int i = 0; i < input.length; i++) {
			input[i] = reverse(input[i]);
		}

		// print result
		for (int i = 0; i < input.length; i++) {
		    System.out.print(input[i] + " ");
		}

	}

}
