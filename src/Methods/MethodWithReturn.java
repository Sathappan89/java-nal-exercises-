package Methods;

public class MethodWithReturn {

	/*
	 * Method with Return Value (int) and with Parameters (int, int): Assignment:
	 * Write a method to add two integers and return the result. Signature: public
	 * int add(int num1, int num2)
	 */

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int d=MethodWithReturn.sum(10, 35);
		System.out.println(d);
	}

}
