package Methods;

/*Method without Return Value (void) and with Parameters (String[]): Will cover this with String
Manipulation Concept.
Assignment: Write a method to print each element of a string array in reverse order.
Signature: public void printReverseStringArray(String[] strings)*/
public class StringArrayReversal {

	public void printReverseStringArray(String[] a) {

		int len = a.length;

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {

		String a[] = { "s", "t", "a", "r", "s" };

		StringArrayReversal str = new StringArrayReversal();
		str.printReverseStringArray(a);

	}

}
