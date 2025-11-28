package Methods;

public class SumOfArrays {

	public static double calculateAverage(double[] numbers) {
		//
		double sum = 0.0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println("Total numbers = " + sum);
		System.out.println("Lenght of an array = " + numbers.length);

		return sum / numbers.length;

	}

	public static void main(String[] args) {

		double a[] = { 10.0, 20.0, 30.0 };

		double result = SumOfArrays.calculateAverage(a);

		System.out.println("average of elements in a double array + " + result);

	}

}
