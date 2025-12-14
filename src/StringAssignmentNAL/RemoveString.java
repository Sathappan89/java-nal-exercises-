package StringAssignmentNAL;
/*Remove all spaces in a String .
For example : “ Hello Everyone “ . Expected result: “HelloEveryone”
.*/
public class RemoveString {

	public static void main(String[] args) {
		
		String assignment = "   Hello   Everyone   ";
		System.out.println(assignment.replaceAll(" ", ""));
	}

}
