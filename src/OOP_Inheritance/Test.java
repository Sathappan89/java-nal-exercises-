package OOP_Inheritance;

public class Test {

	public static void main(String[] args) {
		
		UGStudent std=new UGStudent();
		
		std.CS();
		std.EEE();
		std.EIE();
		System.out.println(" ");
		System.out.println("--------------------");
		
		std.EEEhod();
		std.CShod();
		std.EIEhod();
		System.out.println(" ");
		System.out.println("--------------------");
		
		std.Annauniversity();
		System.out.println(" ");
		System.out.println("--------------------");
		
		System.out.println(" ");
		System.out.println("---------static method of teacher interface-----------");
		Teacher.ECE();
		
		System.out.println(" ");
		System.out.println("--------class extends------------");
		std.pg();
		
		System.out.println(" ");
		System.out.println("---------TOP CASTING----------");
		
		
		Teacher tg=new UGStudent();
		tg.CS();
		tg.EEE();
		tg.EIE();
		
		
		System.out.println(" ");
		System.out.println("---------Interface to Inteface Casting----------");
		
		HOD ad=(HOD)(tg);
		ad.CShod();
		ad.EEEhod();
		ad.EIEhod();
		
//		Screenshot a1=(Screenshot)(tg);
//		a1.ss();
//		

	}

}
