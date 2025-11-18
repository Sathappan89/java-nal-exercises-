package Loops;

public class ProgramThree {
	/** WAP to print 10 to 1 using for, while and do-while loop **/
	public static void main(String[] args) {
		
		int i=1;
		while(i<11) {
			System.out.println("WHILE LOOP = " + i + " ");
			i++;
		}
		System.out.println("");
		
		int j=1;
		do {
			System.out.println("DO WHILE LOOP = " + j + " ");
			j++;
		}while(j<11);

	}

}
