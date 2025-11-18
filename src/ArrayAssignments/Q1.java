package ArrayAssignments;

import java.util.Arrays;

public class Q1 {
	/*
	 * WAP to delete a specific number from the given array. int p[] =
	 * {1,4,5,2,3,22,31, 2}; --Need to remove 22 from the p[] array. --output should
	 * be: [1, 4, 5, 2, 3, 31, 2]
	 */
	public static void main(String[] args) {

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int len = p.length;

		int a[] = new int[len];

		int j = 0;

		System.out.println(p[0]);
		System.out.println(p[len - 1]);
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		int result[] = Arrays.copyOf(a, j);
		System.out.println(Arrays.toString(result));
		System.out.println(result); // [I@5e9f23b4
	}

}
