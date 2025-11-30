package OOP_InterfaceConcept_Ass;

public class IIAA implements IndiaeductionaSystem,UKeducationSystem,USeducationSystem {

	@Override
	public void MS() {
		System.out.println("IIA---MS-----US----Eduction");
		
	}

	@Override
	public void PHD() {
		System.out.println("IIA--PHD-----US----Eduction");
		
	}

	@Override
	public void BS() {
		System.out.println("IIA--BS-----UK----Eduction");
		
	}

	@Override
	public void MBBS() {
		System.out.println("IIA--MBBS-----UK----Eduction");
		
	}

	@Override
	public void FirstGrade() {
		System.out.println("IIA--1ST-----INDIA----Eduction");
		
	}

	@Override
	public void TenthGrade() {
		System.out.println("IIA--10TH-----INDIA----Eduction");
		
	}
	
	public void IIA() {
		System.out.println("IIA");
	}

}