package OOP_InterfaceConcept_Ass;

public class NITA implements IndiaeductionaSystem,UKeducationSystem,USeducationSystem {

	@Override
	public void MS() {
		System.out.println("NIT--MS-----US----Eduction");
		
	}

	@Override
	public void PHD() {
		System.out.println("NIT--PHD-----US----Eduction");
		
	}

	@Override
	public void BS() {
		System.out.println("NIT--BS-----UK----Eduction");
		
	}

	@Override
	public void MBBS() {
		System.out.println("NIT--MBBS-----UK----Eduction");
		
	}

	@Override
	public void FirstGrade() {
		System.out.println("NIT--ST-----INDIA----Eduction");
		
	}

	@Override
	public void TenthGrade() {
		System.out.println("NIT--10TH-----INDIA----Eduction");
		
	}
	
	public void NIT() {
		System.out.println("NIT");
	}
}
