package functions;
public class add {
	public int add() {
		int a =10;
		int b =20;
		int c =a+b;
		return c;
	}	
	public int add(int a,int b,int c) {
		int d =a+b;
		return d;
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		add c1=new add();
		int result =c1.add(10,40);
		System.out.println(result);
	}
}