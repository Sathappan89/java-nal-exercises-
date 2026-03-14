package staticFunction;

public class Employee {

	public void sendMail() {
		System.out.println("send mail");
	}
	
	public static void readMail() {
		System.out.println("read mail");
	}
	
	
	public static void main(String[] args) {
		//1. How to access non static method: create the object of the class
		Employee e = new Employee();
		e.sendMail();
		
		//2. How to access static methods:
			//a. call it directly:
			readMail();
			
			//b. using class name:
			Employee.readMail();
			
			//c. can use ref variable:
			e.readMail(); // The static method readMail() from the type Employee should be accessed in a static way
		
			
			
	}

}