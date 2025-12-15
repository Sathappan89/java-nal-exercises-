package StringAssignmentNAL;
/*Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split,
loop) .*/
public class ProgramNine {
	
	public static void result(String a) {
		
		String results = " ";
		
		String sp[]=a.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
	}

	public static void main(String[] args) {
		String a = "My Name is Sathappan";
		result(a);
	}

}
