package OOP_Inheritance;

public class UGStudent extends PGStudent implements Teacher, HOD,Principle{

	@Override
	public void Annauniversity() {
		System.out.println("Principle--Interface");
		
	}

	@Override
	public void CShod() {
		System.out.println("HOD--CS--Interface");
		
	}

	@Override
	public void EEEhod() {
		System.out.println("HOD--EEE--Interface");
		
	}

	@Override
	public void EIEhod() {
		System.out.println("HOD--EIE--Interface");
		
	}

	@Override
	public void CS() {
		System.out.println("TEACHER--CS--Interface");
		
	}

	@Override
	public void EEE() {
		System.out.println("TEACHER--EEE--Interface");
		
	}

	@Override
	public void EIE() {
		System.out.println("TEACHER--EIE--Interface");
		
	}

}
