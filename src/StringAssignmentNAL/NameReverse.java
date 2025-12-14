package StringAssignmentNAL;

public class NameReverse {
	/* Write a function/ method to reverse your own name. */

	public static String Reverse(String name) {

		// null
		if (name == null) {
			throw new RuntimeException("name is null");
		}

		//
		if (name.length() == 1) {
			return name;
		}

		// length check==0 //o(1)
		if (name.length() == 0) {
			return name;
		}

		String revName = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}

		return revName;
	}

	public static void main(String[] args) {

		String name = "Sathappan";
		String result = NameReverse.Reverse(name);
		System.out.println(result);

		String a = null;

	}

}
