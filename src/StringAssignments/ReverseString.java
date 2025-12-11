package StringAssignments;

public class ReverseString {

	// testing automation selenium - Don't change the possible
	// split , reverse and append

	public static String rev(String str) {

		/** null check **/
		if (str == null) { // o(1)
			throw new RuntimeException("str is null");
		}

		/** length check **/ // o(1)
		if (str.length() == 1) {
			return str;
		}

		// length check==0 //o(1)
		if (str.length() == 0) {
			return str;
		}

		String words[] = str.split(" ");

		StringBuilder finalStr = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			StringBuilder revWord = new StringBuilder();

			// reverse each word
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord.append(word.charAt(j));
			}

			finalStr.append(revWord);

			// add space between words except last one
			if (i < words.length - 1) {
				finalStr.append(" ");
			}
		}

		return finalStr.toString();


	}

	public static void main(String[] args) {

		String str = "testing automation selenium";
		String res = ReverseString.rev(str);
		System.out.println(res);

	}

}
