package ArrayAssignments;

public class Q3 {
	/*
	 * Print all the elements of this array using for, for each, while and do-while
	 * loop: 
	 * 
	 * int p[] = {1,3,4,5,22,56,89,90}
	 */
	public static void main(String[] args) {
		
		int p[] = {1,3,4,5,22,56,89,90};
		
		System.out.println("*******FOR LOOP*******");
		
		for(int i=0;i<p.length-1;i++) {
			System.out.print(p[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("*******WHILE LOOP*******");
		
		int j=0;
		while(j<=p.length-1){
			System.out.print(p[j] + " ");
			j++;
			
		}

	}

}
