package Methods;

/*Method with Return Value (String) and with Parameters (String[]):
Assignment: Write a method to concatenate all strings in a string array and return the
concatenated string.
Signature: public String concatenateStrings(String[] strings)*/
public class ConcatenateString {

	public static String concatenateStrings(String[] myStr) {

		String finalStr = "";
		for (String e : myStr) {
			finalStr = finalStr + e;
		}
		return finalStr;
	}

	public static void main(String[] args) {

		String str[] = { "Naveen ", "Automation ", "Labs ", "Java ", "S" };
		String s = concatenateStrings(str);
		System.out.println(s);

	}

}
