package Loops;

public class ProgramEightA {
	/*
	 * Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one using
	 * while and for loop.
	 */
	public static void main(String[] args) {

		System.out.println("------WHILE LOOP-------");
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " ASCII = " + (int) ch);
			ch++;
		}

		System.out.println("------FOR LOOP-------");

		for (char j = 'A'; j <= 'Z'; j++) {
			System.out.println(j + " ASCII = " + (int) j);
		}

		System.out.println("------DO WHILE LOOP-------");

		char k = '0';
		do {
			System.out.println(k + " ASCILL =" + (int)k);
			k++;
		} while (k <= '9');

	}

}