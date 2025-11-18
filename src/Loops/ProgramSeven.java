package Loops;

public class ProgramSeven {
	/* Print all odd and even numbers between 1 to 100 */
	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i + " is a odd number");
			}
			else {
				System.out.println(i + " is a even number");
			}
		}

	}

}
