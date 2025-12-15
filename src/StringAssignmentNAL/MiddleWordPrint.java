package StringAssignmentNAL;

/* Assume that a string consists of 3 words, print out the middle one.*/
public class MiddleWordPrint {

	public static void main(String[] args) {

		String word = "Word1 MiddleWord Word3";

		String sg[] = word.split(" ");
		String pt = sg[1];
		System.out.println(pt);

	}

}
