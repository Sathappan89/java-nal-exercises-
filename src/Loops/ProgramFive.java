package Loops;

public class ProgramFive {
	/*
	 * Write a program in Java to print all the multiplication of 5 from 1 to 100
	 * using while /for/do-while loop
	 */
	public static void main(String[] args) {

		System.out.println("----FOR LOOP----");
		for (int i = 1; i <= 11; i++) {
			System.out.println(i);
		}

		System.out.println("-----WHILE LOOP------");
		int j = 1;
		while (j < 11) {
			System.out.println(j);
			j++;
		}

		System.out.println("-----DO WHILE LOOP------");

		int g = 1;

		do {
			System.out.println(g);
			g++;
		} while (g < 11);

	}
}