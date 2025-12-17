package StringAssignmentNAL;

public class PalindromeProgram {

	public static String Palindrome(String s) {

		if (s.length() == 0) {
			System.out.println(s);
		}

		if (s.length() == 1) {
			System.out.println(s);
		}

		String revString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
		}

		return revString;

	}

	public static void main(String[] args) {

		String s = "madams";
		String nn = PalindromeProgram.Palindrome(s);
		System.out.println(nn);

		if (nn.equalsIgnoreCase(s)) {
			System.out.println("Palindrom");
		} else {
			System.out.println(" Not Palindrom");
		}

	}

}
