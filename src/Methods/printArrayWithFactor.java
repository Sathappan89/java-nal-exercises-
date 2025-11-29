package Methods;
/*
 * Method without Return Value (void) and with Parameters (int, int[]):
 * 
 * Assignment: Write a method to print each element of an int array multiplied by a given factor.
 * 
 * Signature: public void printArrayWithFactor(int factor, int[] array)
 * 
 * */
public class printArrayWithFactor {

	public static void printArrayWithFactor(int factor, int[] array) {
		
		for(int i=1;i<=array.length;i++) {
			System.out.print((i * factor) + " ");
		}
		System.out.println(); //2 4 6 8 10		
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		printArrayWithFactor(2, array);

	}

}
