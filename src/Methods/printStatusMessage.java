package Methods;

/**
 * Method without Return Value (void) and with Parameters (String, boolean):
 * Assignment: Write a method to print a message based on a boolean value (true
 * for success, false for failure).
 */
public  class printStatusMessage {

	public static void printStatusMessage1(String message, boolean isSuccess) {
			if (isSuccess) {
			System.out.println("Success: " + message);
			} else {
			System.out.println("Failure: " + message);
			}
	}

	public static void main(String[] args) {
	
		printStatusMessage1("Operation completed successfully", true);
		printStatusMessage1("Operation failed", false);
	}

}
