package StringAssignmentNAL;

/*Write a program to get the 3rd “ e “ of the string .*/
public class FindaChar {

	public static char result(String test) {

		int a = test.indexOf("e");
		int b = test.indexOf("e", a + 1);
		int c = test.indexOf("e", b + 1);

		char testing = test.charAt(c);
		System.out.print("index of the third character at " + c + "th place = ");
		return testing;

	}

	public static void main(String[] args) {

		String test = "Welcome to Naveen Automation Labs ! ";
		char answer = result(test);
		System.out.println(answer);
		
		String tester = "String Assignment to be completed soon";
		char answers = result(tester);
		System.out.println(answers);

	}

}
