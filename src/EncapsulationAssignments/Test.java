package EncapsulationAssignments;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.printInfo("Shriram", 37, "Male");
		
		System.out.println(" ");
		System.out.println("-----------GET---------------");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		
		
		System.out.println(" ");
		System.out.println("-----------UPDATE---------------");
		p1.setName("Raghu");
		p1.setAge(40);
		p1.setGender("MM");
		
		System.out.println(" ");
		System.out.println("-----------GET---------------");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());

	}
	
}

