package StringAssignmentNAL;

public class specificIndex {
/*Write a method which gives an index of (-1) if string is not available. . it should return integer. if String
is present, then it should return the specific index.*/
	
	public static int result(String str) {
		
		if(str.length()==0) {
			return -1;
		}
		
		if(str.length()>=0) {
			return str.length();
		}
		return 0;
		
	
	}
	
	
	public static void main(String[] args) {
		
		String str = "test";
		String str1="";
		int c=result(str);
		int d=result(str1);
		System.out.println(c);//4
		System.out.println(d);//-1
	}

}
