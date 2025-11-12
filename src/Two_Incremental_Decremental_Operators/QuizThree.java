package Two_Incremental_Decremental_Operators;

public class QuizThree {

	public static void main(String[] args) {
		
		int i=0;
		i=i++ - --i + ++i - i--;
		System.out.println(i); //0
		int j=0;
		int k=--j;
		System.out.println(k); //-1

	}

}
