package StringAssignmentNAL;
public class EqualityCheck {
	public static void main(String[] args) {

		String s1 = "Testing";
		String s2 = "Testing";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2));

		String s3 = new String("Testing");
		System.out.println(s1 == s3);// false
		System.out.println(s2.equals(s3)); // true

		String s4 = new String("Testing");
		System.out.println(s3 == s4);// false
		System.out.println(s4.equals(s3)); // true

		StringBuilder B1 = new StringBuilder("Test");
		StringBuilder B2 = new StringBuilder("Test");
		System.out.println(B1 == B2);// false
		System.out.println(B1.equals(B2)); // false
		System.out.println(B1.toString().equals(B2.toString()));// true

		StringBuffer B3 = new StringBuffer("Test");
		System.out.println(B1.toString().equals(B3.toString()));// true

	}

}
