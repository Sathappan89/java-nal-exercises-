package Three_Widening_Narrowing;

public class WideningCasting {

	/*
	 * Widening Casting Assignment: Write a Java program that demonstrates widening
	 * casting. Create variables of different data types such as int, float, double,
	 * etc. Assign values to them and then cast them to a higher data type. Finally,
	 * print out the original and casted values to observe widening casting in
	 * action.
	 */
	public static void main(String[] args) {

		int intValue = 10;
		float floatValue = 20.5f;
		double doubleValue = 30.75;
		
		System.out.println((byte)intValue);
		System.out.println((int)floatValue);
		System.out.println((float)floatValue);
	}

}
