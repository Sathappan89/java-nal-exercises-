package StringAssignmentNAL;

public class LastPartoftheString {

	public static String part(String part) {

		String lastPart = " ";

		String arr[] = part.split(" ");

		lastPart = arr[arr.length - 1];

		return lastPart;
	}

	public static void main(String[] args) {

		String part = "Testing Automation UserStories";
		String result = LastPartoftheString.part(part);
		System.out.println(result);

	}

}
