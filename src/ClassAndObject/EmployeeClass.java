package ClassAndObject;
public class EmployeeClass {
	String name;
	int age;
	double salary;
	double totalSalary;
	public static void main(String[] args) {
		EmployeeClass e1=new EmployeeClass();
		e1.name="Sachin";
		e1.age=45;
		e1.salary=10000.00;
		e1.totalSalary=11000.30;
		System.out.println(e1.name + " " +e1.age + " " + e1.salary + " " + e1.totalSalary);
	}
}