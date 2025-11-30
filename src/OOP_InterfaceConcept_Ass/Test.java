package OOP_InterfaceConcept_Ass;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("----IITA-----");
		IITA a=new IITA();
		a.MS();
		a.PHD();
		a.BS();
		a.MBBS();
		a.FirstGrade();
		a.TenthGrade();
		a.IIT();
		
		/*TOP CASTING*/
		
		System.out.println(" ");
		System.out.println("----USeducationSystem Top Casting-----");
		USeducationSystem a1=new IITA();
		a1.MS();
		a1.PHD();
		
		System.out.println(" ");
		System.out.println("----UKeducationSystem Top Casting-----");
		UKeducationSystem a2=new IITA();
		a2.BS();
		a2.MBBS();
		
		
		System.out.println(" ");
		System.out.println("----IndiaeductionaSystem Top Casting-----");
		IndiaeductionaSystem a3=new IITA();
		a3.FirstGrade();
		a3.TenthGrade();
		
		System.out.println(" ");
		System.out.println("----IIAA-----");
		IIAA b=new IIAA();
		b.MS();
		b.BS();
		b.FirstGrade();
		b.IIA();
		
		

	}

}
