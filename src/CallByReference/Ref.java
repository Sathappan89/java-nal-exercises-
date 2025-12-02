package CallByReference;

public class Ref {
	/*
	 * Whenever we are calling (Static Method calling -to- Non-Static Method) : we
	 * need to create an object. So avoid creating object, use call by reference.
	 */
	
	
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public static void result(Ref t1) { //class parameter
		System.out.println("Result in sum method");
		t1.sum(25, 25);
	}
	
	public static void main(String[] args) {
		
		Ref test1=new Ref();
//		test1.sum(20, 10);
		
		Ref.result(test1);

	}

}
