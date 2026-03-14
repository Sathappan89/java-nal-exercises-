package functions;
public class sumExample {
	public int add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		sumExample e1=new sumExample();
		int ans=e1.add(10, 20);
		System.out.println(ans);
	}
}