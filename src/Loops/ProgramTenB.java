package Loops;

public class ProgramTenB {

	public static void main(String[] args) {
		
		System.out.println("Vowels using while loop:");
				char ch = 'a';
				while(ch <= 'z') {
				if(ch == 'a' || ch ==
				'e' || ch == 'i' || ch == 'o' ||
				ch == 'u') {
				System.out.print(ch + " ");
				}
				ch++;
				}

	}

}