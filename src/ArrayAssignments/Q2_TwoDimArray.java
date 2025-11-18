package ArrayAssignments;

import java.util.Arrays;

public class Q2_TwoDimArray {
	/*
	 * Print all the elements of this array using for, for each, while and do-while
	 * loop: int p[] = {1,3,4,5,22,56,89,90}
	 */
	public static void main(String[] args) {
		Object player[] = { "Sachin", 40, "India", 'M', "01-01-2000", "100" };
		Object player1[] = { "Sath", 30, "India", 'M', "01-01-1989", "200" };

		// Combine into 2D array
		Object[][] players = { player, player1 };

		// Single for-each loop
		for (Object[] p : players) {
			System.out.println(Arrays.toString(p));
		}

	}

}