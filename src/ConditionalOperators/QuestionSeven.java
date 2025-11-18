package ConditionalOperators;

import java.util.Scanner;

public class QuestionSeven {
	/*
	 * WAP to launch browsers using If-ElseIf and Switch Case. a. Browser:
	 * Chrome/Firefox/IE/Safari b. If user passes wrong browser, print please pass
	 * the right browser name
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Browser = sc.nextLine();

		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Execute in Chrome");
			break;
		case "firefox":
			System.out.println("Execute in firefox");
			break;
		case "ie":
			System.out.println("Execute in ie");
			break;
		case "safari":
			System.out.println("Execute in safari");
			break;
		default:
			System.out.println("Please pass the wrong browser");
			break;
		}

	}

}