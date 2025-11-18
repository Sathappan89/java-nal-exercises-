package Loops;

public class ProgramNineB {
	/*
	 * Reverse Alphabet Series: Develop a Java program to print the series of
	 * lowercase alphabets in reverse order from 'z' to 'a'.
	 */
	public static void main(String[] args) {

		System.out.println("------LOWER CASE ALPHABETS------------");
		
		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.println(ch + " lowercase alphabets " + (int) ch);
		}
		
		System.out.println("------UPPER CASE ALPHABETS------------");
		
		for (char chr = 'Z'; chr >= 'A'; chr--) {
			System.out.println(chr + " uppercase alphabets " + (int) chr);
		}
		
		

	}

}
