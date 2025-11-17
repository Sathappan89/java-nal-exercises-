package ConditionalOperators;

import java.util.Scanner;

public class QuestionSix {
	/*
	 * WAP to book the specific type of car from the Uber app using Switch - Case.
	 * a. Car Type: Mini, Sedan, SUV, Premium b. If user passes wrong car type,
	 * print please select the right car type
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String CarType = sc.nextLine();

		switch (CarType.toLowerCase().trim()) {

		case "toyota sienna":
			System.out.println("Toyota Sienna - SUV");
			break;

		case "teslas":
			System.out.println("TeslaS - Mini");
			break;

		case "bmw":
			System.out.println("BMW - Premium");
			break;

		case "honda":
			System.out.println("Honda - Sedan");
			break;
		default:
			System.out.println("please select the right car type");
			break;
		}
		sc.close();
	}
}