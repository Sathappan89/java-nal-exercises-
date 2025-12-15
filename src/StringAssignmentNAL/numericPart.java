package StringAssignmentNAL;

/*get only numeric part from this String:
String s = "your transaction id is: 12345 and reference id is 34567";*/
public class numericPart {

	public static void main(String[] args) {

		String ss = "your transaction id is: 12345 and reference id is 34567";

		String numbers = ss.replaceAll("\\D+", " ");// \\D+ matches any sequence of non-digit characters.

		System.out.println(numbers.trim());

	}

}
