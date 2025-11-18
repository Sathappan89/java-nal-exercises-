package Loops;

public class ProgramNineA {
	/*
	 * 1. Even Numbers Series: Write a Java program to print the series of even
	 * numbers from 2 to 100.
	 */
	public static void main(String[] args) {

		System.out.println("*****EVEN NUMBER*****");
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		System.out.println("*****EVEN NuMBER*****");

		int j = 2;
		do {
			if (j % 2 == 0) {
				System.out.print(j + " ");
			}
			j++;
		} while (j <= 100);

		System.out.println(" ");
		System.out.println("*****EVEN NuMBER*****");

		int g = 2;

		while (g <= 100) {
			if (g % 2 == 0) {
				System.out.print(g + " ");
			}
			g++;
		}

	}

}