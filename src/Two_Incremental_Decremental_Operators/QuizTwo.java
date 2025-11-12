package Two_Incremental_Decremental_Operators;

public class QuizTwo {

	public static void main(String[] args) {

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c); // 103
		System.out.println(a); // 13
		System.out.println(b); // 24

	}

}