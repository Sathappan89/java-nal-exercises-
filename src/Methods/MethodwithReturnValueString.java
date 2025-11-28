package Methods;

/*Method with Return Value (boolean) and with Parameters (String, String):
Assignment: Write a method to compare two strings and return true if they are equal, false
otherwise.
Signature: public boolean compareStrings(String str1, String str2)*/
public class MethodwithReturnValueString {

	public static boolean comPare(String a, String b) {
		boolean isFlag = true;
		if (a.equals(b)) {
			isFlag = true;
		} else {
			isFlag = false;
		}
		return isFlag;
	}

	public static void main(String[] args) {
		boolean result = MethodwithReturnValueString.comPare("Sathappan", "Sathappan");
		System.out.println(result);
		
		boolean result1 = MethodwithReturnValueString.comPare("Annamalai", "Sathappan");
		System.out.println(result1);

	}

}
