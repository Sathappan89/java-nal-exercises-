package ConditionalOperators;

import java.util.Scanner;

public class QuestionFive {
	/*
	 * WAP to run your test cases in a specific environment like: QA, Stage, Dev,
	 * UAT, Prod using using Switch - Case
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Environment = sc.nextLine();

		switch (Environment.toUpperCase().trim()) {
		case "QA":
			System.out.println("Run the QA Test Cases");
			break;
		case "Stage":
			System.out.println("Run the Stage Test Cases");
			break;
		case "Dev":
			System.out.println("Run the Dev Test Cases");
			break;
		case "UAT":
			System.out.println("Run the UAT Test Cases");
			break;
		case "Prod":
			System.out.println("Run the Prod Test Cases");
			break;
		default:
			System.out.println("Don't run the test cases");
			break;
		}
		sc.close();

	}

}