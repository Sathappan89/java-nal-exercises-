package Two_Incremental_Decremental_Operators;

public class QuizTen {
	/* What will be the output of the following program? */
	public static void main(String[] args) {

		int a = 1;

		a = a++ + ++a * --a - a--;

		System.out.println(a); //5

	}

}
