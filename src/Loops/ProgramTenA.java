package Loops;

public class ProgramTenA {

	public static void main(String[] args) {
		System.out.println("Vowels using for loop:");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch + " ");
			}

		}
	}
}