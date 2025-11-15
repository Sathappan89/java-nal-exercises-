package Two_Incremental_Decremental_Operators;

public class QuizNine {
	/* Guess the value of p in the below program? */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;

		System.out.println(p); //1

		System.out.println(m); //-2

		System.out.println(n); //-2

	}

}
