package OOP_Encapsulation_Assignments_2;

public class BNK {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount("testing", 100,"324708303");
		double d1=b1.depositinAccount(10.0);
		System.out.println(d1);
		double w1=b1.withdrawinAccount(20.0);
		System.out.println(w1);
		b1.printStatement();

	}

}
