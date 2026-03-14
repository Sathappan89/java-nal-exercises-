package ArrayAssignments;

import java.util.Arrays;

/**/
public class Q1a {

	public static void main(String[] args) {
		
		int p[]= {1,4,5,2,3,22,31,2};
		int valueToRemove = 22;
		int count=0;
		for(int i=0;i<p.length;i++) {
			if(p[i]!=22) {
				count++;
			}
		}
		System.out.println(count); //7
		
		int[] result=new int[count];
		int index=0;
		
		for(int i=0;i<p.length;i++) {
			if(p[i]!=valueToRemove) {
				result[index]=p[i];
				index++;
			}
		}
        System.out.println(Arrays.toString(result));

	}

}
