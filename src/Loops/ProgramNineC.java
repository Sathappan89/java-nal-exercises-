package Loops;

public class ProgramNineC {
	/*
	 * Floating Point Series: Write a Java program to print the series of
	 * floating-point numbers from 1.0 to 10.0.
	 */
	public static void main(String[] args) {

		for (double fl = 1.0; fl <= 10.0; fl++) {
			if (fl == 10.0) {
				System.out.print(fl + "  ");
			} else {
				System.out.print(fl + " , ");
			}
		}

	}

}
