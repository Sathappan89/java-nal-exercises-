package Three_Widening_Narrowing;

public class NarrowingCasting {

	/*
	 * Develop a Java program to illustrate narrowing casting. Declare variables of
	 * higher data types like double, float, long, etc., and assign values to them.
	 * Then, cast these variables to lower data types like int, short, byte, etc.
	 * Print out the original and casted values to observe narrowing casting in
	 * action.
	 */
	public static void main(String[] args) {

		double doubleValue = 45.75;
		float floatValue = 30.5f;
		long longValue = 1000000000L;

		System.out.println((float) doubleValue);
		System.out.println((double) floatValue);
		System.out.println((long) longValue);

	}

}
