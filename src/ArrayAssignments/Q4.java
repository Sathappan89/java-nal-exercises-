package ArrayAssignments;

import java.util.Arrays;

public class Q4 {
	/*
	 * Print all the elements of this array in reverse order using for, for each,
	 * while and do-while loop: int p[] = {1,3,4,5,22,56,89,90}
	 */
	public static void main(String[] args) {
		
		 int p[] = {1,3,4,5,22,56,89,90};
		 
		 System.out.println("*******FOR LOOP*******");
		 
		 for(int i=p.length-1;i>=0;i--) {
			 System.out.print(p[i] + " ");
		 }

		System.out.println(" ");
		System.out.println("*******WHILE LOOP*******");
		
		int j=p.length-1;
		
		while(j>=0) {
			System.out.print(p[j] + " ");
			j--;
		}
		

		System.out.println(" ");
		System.out.println("*******FOR EACH LOOP-Reverse*******");

		int k=p.length-1;
		
		for(int e:p) {
			System.out.print(p[k] + " ");
			k--;
		}
		
		
		System.out.println(" ");
		System.out.println("*******FOR EACH LOOP-Normal*******");

		//int l=0;
		
		for(int e:p) {
			//System.out.print(p[l] + " ");
			//l++;
			System.out.println(Arrays.toString(p));
			break;
		}
		
		
		System.out.println(" ");
		System.out.println("*******DO WHILE LOOP*******");
		
		int g=p.length-1;
		
		do{
			System.out.print(p[g] + " ");
			g--;
		}while(g>=0);
	}

}
