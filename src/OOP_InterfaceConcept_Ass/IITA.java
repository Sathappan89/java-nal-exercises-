package OOP_InterfaceConcept_Ass;

public class IITA implements IndiaeductionaSystem,UKeducationSystem,USeducationSystem  {

	@Override
	public void MS() {
		System.out.println("IIT---MS-----US----Eduction");
		
	}

	@Override
	public void PHD() {
		System.out.println("IIT--PHD-----US----Eduction");
		
	}

	@Override
	public void BS() {
		System.out.println("IIT--BS-----UK----Eduction");
		
	}

	@Override
	public void MBBS() {
		System.out.println("IIT--MBBS-----UK----Eduction");
		
	}

	@Override
	public void FirstGrade() {
		System.out.println("IIT---1ST-----INDIA----Eduction");
		
	}

	@Override
	public void TenthGrade() {
		System.out.println("IIT--10TH-----INDIA----Eduction");
		
	}
	
	public void IIT() {
		System.out.println("IIT");
	}

}
