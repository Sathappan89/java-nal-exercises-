package ArrayAssignments;

import java.util.Arrays;

public class Q2 {
	/*
	 * Write a program to create a static Array, having following cricket data:
	 * --name, age, team name, DOB, gender, Strike Rate --Try to create multiple
	 * Object Arrays for different players --Try to print all the values of each
	 * player on the console using for and for each loops
	 */
	public static void main(String[] args) {
		
		Object player[]=new Object[6];
		player[0]="Sachin";
		player[1]=40;
		player[2]="India";
		player[3]='M';
		player[4]="01-01-2000";
		player[5]="100";
		
		Object player1[]=new Object[6];
		player1[0]="Sath";
		player1[1]=30;
		player1[2]="India";
		player1[3]='M';
		player1[4]="01-01-1989";
		player1[5]="200";
		
		System.out.println(Arrays.toString(player));
		System.out.println(Arrays.toString(player1));
		
		for(Object e:player) {
			System.out.println(Arrays.toString(player));
			break;
		}
		
		for(int i=0;i<player.length;i++) {
			System.out.println(player[i]);
		}
	}

}
